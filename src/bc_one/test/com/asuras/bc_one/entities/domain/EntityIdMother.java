package com.asuras.bc_one.entities.domain;

import com.asuras.shared.domain.UuidMother;


public final class EntityIdMother {
    public static EntityId create(String value) {
        return new EntityId(value);
    }

    public static EntityId random() {
        return create(UuidMother.random());
    }
}