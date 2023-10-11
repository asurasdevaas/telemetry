package com.asuras.bc_one.entities.domain;

import com.asuras.shared.domain.WordMother;

public class EntityNameMother {
    public static EntityName create(String value) {
        return new EntityName(value);
    }

    public static EntityName random() {
        return create(WordMother.random());
    }
}
