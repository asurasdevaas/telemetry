package com.asuras.shared.domain.entity;

import com.asuras.shared.domain.bus.event.DomainEvent;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

public final class EntityCreatedDomainEvent extends DomainEvent {
    private final String name;
    private final String description;

    public EntityCreatedDomainEvent() {
        super(null);

        this.name     = null;
        this.description = null;
    }

    public EntityCreatedDomainEvent(String aggregateId, String name, String duration) {
        super(aggregateId);

        this.name     = name;
        this.description = duration;
    }

    public EntityCreatedDomainEvent(
            String aggregateId,
            String eventId,
            String occurredOn,
            String name,
            String duration
    ) {
        super(aggregateId, eventId, occurredOn);

        this.name     = name;
        this.description = duration;
    }

    @Override
    public String eventName() {
        return "entity.created";
    }

    @Override
    public HashMap<String, Serializable> toPrimitives() {
        return new HashMap<String, Serializable>() {{
            put("name", name);
            put("description", description);
        }};
    }

    @Override
    public EntityCreatedDomainEvent fromPrimitives(
            String aggregateId,
            HashMap<String, Serializable> body,
            String eventId,
            String occurredOn
    ) {
        return new EntityCreatedDomainEvent(
                aggregateId,
                eventId,
                occurredOn,
                (String) body.get("name"),
                (String) body.get("description")
        );
    }

    public String name() {
        return name;
    }

    public String description() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EntityCreatedDomainEvent that = (EntityCreatedDomainEvent) o;
        return name.equals(that.name) &&
                description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}