package com.asuras.apps.app_one.controller.entities;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.asuras.bc_one.entities.application.create.CreateEntityCommand;
import com.asuras.shared.domain.DomainError;
import com.asuras.shared.domain.bus.command.CommandBus;
import com.asuras.shared.domain.bus.command.CommandHandlerExecutionError;
import com.asuras.shared.domain.bus.query.QueryBus;
import com.asuras.shared.infraestructure.spring.ApiController;

import java.util.HashMap;

@RestController
public final class EntityPutController extends ApiController {
    public EntityPutController(
            QueryBus queryBus,
            CommandBus commandBus
    ) {
        super(queryBus, commandBus);
    }

    @PutMapping(value = "/entities/{id}")
    public ResponseEntity<String> index(
            @PathVariable String id,
            @RequestBody Request request
    ) throws CommandHandlerExecutionError {
        dispatch(new CreateEntityCommand(id, request.name(), request.duration()));

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public HashMap<Class<? extends DomainError>, HttpStatus> errorMapping() {
        return null;
    }
}


final class Request {
    private String name;
    private String duration;

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name() {
        return name;
    }

    String duration() {
        return duration;
    }
}