package com.asuras.bc_one.entities.domain;

import com.asuras.shared.domain.entity.EntityCreatedDomainEvent;

public final class EntityCreatedDomainEventMother {
    public static EntityCreatedDomainEvent create(EntityId id, EntityName name, EntityDescription description) {
        return new EntityCreatedDomainEvent(id.value(), name.value(), description.value());
    }

    public static EntityCreatedDomainEvent fromEntity(Entity entity) {
        return create(entity.id(), entity.name(), entity.description());
    }

    public static EntityCreatedDomainEvent random() {
        return create(EntityIdMother.random(), EntityNameMother.random(), EntityDescriptionMother.random());
    }
}