package com.asuras.bc_one.entities.application.create;

import com.asuras.shared.domain.bus.command.Command;


public class CreateEntityCommand implements Command {

    private final String id;
    private  final String name;
    private  final String description;


    public CreateEntityCommand(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String id() {
        return id;
    }

    public String name() {
        return this.name;
    }

    public String description() {
        return this.description;
    }

}
