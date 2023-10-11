package com.asuras.bc_one.entities.domain;


import com.asuras.bc_one.entities.application.create.CreateEntityCommand;

public final class EntityMother {
    public static Entity create(EntityId id, EntityName name, EntityDescription description) {
        return new Entity(id, name, description);
    }

    public static Entity fromRequest(CreateEntityCommand request) {
        return create(
                EntityIdMother.create(request.id()),
                EntityNameMother.create(request.name()),
                EntityDescriptionMother.create(request.description())
        );
    }

    public static Entity random() {
        return create(EntityIdMother.random(), EntityNameMother.random(), EntityDescriptionMother.random());
    }
}