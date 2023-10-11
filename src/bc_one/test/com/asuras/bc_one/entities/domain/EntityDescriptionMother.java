package com.asuras.bc_one.entities.domain;

import com.asuras.shared.domain.WordMother;

public final class EntityDescriptionMother {
    public static EntityDescription create(String value) {
        return new EntityDescription(value);
    }

    public static EntityDescription random() {
        return create(WordMother.random());
    }
}