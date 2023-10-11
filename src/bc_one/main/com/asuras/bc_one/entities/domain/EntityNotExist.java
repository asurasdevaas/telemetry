package com.asuras.bc_one.entities.domain;

import com.asuras.shared.domain.DomainError;

public final class EntityNotExist extends DomainError {
    public EntityNotExist(EntityId id) {
        super("course_not_exist", String.format("The course <%s> doesn't exist", id.value()));
    }
}