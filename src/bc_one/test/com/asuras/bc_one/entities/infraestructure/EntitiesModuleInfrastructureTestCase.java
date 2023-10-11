package com.asuras.bc_one.entities.infraestructure;

import com.asuras.bc_one.Bc_oneInfrastructureTestCase;
import com.asuras.bc_one.entities.domain.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class EntitiesModuleInfrastructureTestCase extends Bc_oneInfrastructureTestCase {
    @Autowired
    protected InMemoryEntityRepository inMemoryEntityRepository;

}