package com.asuras.bc_one.entities.domain;

import com.asuras.shared.domain.AggregateRoot;
import com.asuras.shared.domain.entity.EntityCreatedDomainEvent;
import java.util.Objects;
public final class Entity extends AggregateRoot {

    private final EntityId id;
    private  final EntityName name;
    private  final EntityDescription description;


    public Entity(EntityId id, EntityName name, EntityDescription description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    private Entity() {
        id       = null;
        name     = null;
        description = null;
    }

    public static Entity create(EntityId id, EntityName name, EntityDescription description) {

        Entity entity = new Entity(id, name, description);

        entity.record( new EntityCreatedDomainEvent(id.value(), name.value(), description.value()));

        return entity;
    }

    public EntityId id() {
        return id;
    }

    public EntityName name() {
        return this.name;
    }

    public EntityDescription description() {
        return this.description;
    }




    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Entity entity = (Entity) o;

        return id.equals(entity.id()) &&
                name.equals(entity.name()) &&
                description.equals(entity.description());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }
}
