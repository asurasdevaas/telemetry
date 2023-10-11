package com.asuras.bc_one.entities.application.create;

import com.asuras.bc_one.entities.domain.*;

public final class CreateEntityCommandMother {
    public static CreateEntityCommand create(EntityId id, EntityName name, EntityDescription description) {
        return new CreateEntityCommand(id.value(), name.value(), description.value());
    }

    public static CreateEntityCommand random() {
        return create(EntityIdMother.random(), EntityNameMother.random(), EntityDescriptionMother.random());
    }
}