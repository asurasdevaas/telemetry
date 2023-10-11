package com.asuras.bc_one.entities.infraestructure;

import com.asuras.bc_one.entities.domain.Entity;
import com.asuras.bc_one.entities.domain.EntityId;
import com.asuras.bc_one.entities.domain.EntityRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Optional;

@Service
public class InMemoryEntityRepository implements EntityRepository {
    private final HashMap<String, Entity> entities = new HashMap<>();

    @Override
    public void save(Entity entity) {
        entities.put(entity.id().value(), entity);
    }

    @Override
    public Optional<Entity> search(EntityId id) {
        return Optional.ofNullable(entities.get(id.value()));
    }


}
