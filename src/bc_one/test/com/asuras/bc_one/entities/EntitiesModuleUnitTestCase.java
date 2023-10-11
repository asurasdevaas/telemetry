package com.asuras.bc_one.entities;

import org.junit.jupiter.api.BeforeEach;

import com.asuras.bc_one.entities.domain.Entity;
import com.asuras.bc_one.entities.domain.EntityRepository;
import com.asuras.shared.infraestructure.UnitTestCase;

import static org.mockito.Mockito.*;

public abstract class EntitiesModuleUnitTestCase extends UnitTestCase {
    protected EntityRepository repository;

    @BeforeEach
    protected void setUp() {
        super.setUp();
        repository = mock(EntityRepository.class);
    }

    public void shouldHaveSaved(Entity entity) {
        verify(repository, times(1)).save(entity);
    }
}