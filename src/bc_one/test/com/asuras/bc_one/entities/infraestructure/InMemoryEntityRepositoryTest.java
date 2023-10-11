package com.asuras.bc_one.entities.infraestructure;

import com.asuras.bc_one.entities.domain.Entity;
import com.asuras.bc_one.entities.domain.EntityIdMother;
import com.asuras.bc_one.entities.domain.EntityMother;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

final class InMemoryEntityRepositoryTest extends EntitiesModuleInfrastructureTestCase {
    @Test
    void save_a_entity() {
        Entity entity = EntityMother.random();
        inMemoryEntityRepository.save(entity);
    }

    @Test
    void return_an_existing_entity() {
        Entity entity = EntityMother.random();
        inMemoryEntityRepository.save(entity);
        assertEquals(Optional.of(entity), inMemoryEntityRepository.search(entity.id()));
    }

    @Test
    void not_return_a_non_existing_entity() {
        assertFalse(inMemoryEntityRepository.search(EntityIdMother.random()).isPresent());
    }
}