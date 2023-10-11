package com.asuras.bc_one.entities.application.create;

import com.asuras.bc_one.entities.domain.EntityDescription;
import com.asuras.bc_one.entities.domain.EntityId;
import com.asuras.bc_one.entities.domain.EntityName;
import com.asuras.shared.domain.bus.command.CommandHandler;
import org.springframework.stereotype.Service;

@Service
public final class CreateEntityCommandHandler implements CommandHandler<CreateEntityCommand> {
    private final EntityCreator creator;

    public CreateEntityCommandHandler(EntityCreator creator) {
        this.creator = creator;
    }

    @Override
    public void handle(CreateEntityCommand command) {
        EntityId       id       = new EntityId(command.id());
        EntityName     name     = new EntityName(command.name());
        EntityDescription duration = new EntityDescription(command.description());

        creator.create(id, name, duration);
    }
}