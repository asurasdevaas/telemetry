package com.asuras.bc_one.entities.application.create;

import com.asuras.bc_one.entities.domain.*;
import com.asuras.shared.domain.bus.event.EventBus;
import org.springframework.stereotype.Service;


@Service
public final class EntityCreator {
    private final EntityRepository repository;
    private final EventBus         eventBus;

    public EntityCreator(EntityRepository repository, EventBus eventBus) {
        this.repository = repository;
        this.eventBus   = eventBus;
    }

    public void create(EntityId id, EntityName name, EntityDescription description) {
        Entity entity = Entity.create(id, name, description);
        repository.save(entity);
        eventBus.publish(entity.pullDomainEvents());
    }
}