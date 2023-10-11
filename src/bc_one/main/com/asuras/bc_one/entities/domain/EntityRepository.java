package com.asuras.bc_one.entities.domain;

import java.util.Optional;

public interface EntityRepository {
    void save(Entity entity);

    Optional<Entity> search(EntityId id);
}
