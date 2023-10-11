package com.asuras.bc_one.entities.application.create;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.asuras.bc_one.entities.EntitiesModuleUnitTestCase;
import com.asuras.bc_one.entities.domain.Entity;
import com.asuras.bc_one.entities.domain.EntityCreatedDomainEventMother;
import com.asuras.bc_one.entities.domain.EntityMother;
import com.asuras.shared.domain.entity.EntityCreatedDomainEvent;

final class CreateEntityCommandHandlerTest extends EntitiesModuleUnitTestCase {
    private CreateEntityCommandHandler handler;

    @BeforeEach
    protected void setUp() {
        super.setUp();
        handler = new CreateEntityCommandHandler(new EntityCreator(repository, eventBus));
    }

    @Test
    void create_a_valid_entity() {
        CreateEntityCommand command = CreateEntityCommandMother.random();

        Entity                   entity      = EntityMother.fromRequest(command);

        EntityCreatedDomainEvent domainEvent = EntityCreatedDomainEventMother.fromEntity(entity);


        System.out.println("---------------------------------------------------------");

        System.out.println(entity.id().value());
        System.out.println(command);
        System.out.println(repository != null);
        System.out.println(repository);



        handler.handle(command);

        shouldHaveSaved(entity);
        shouldHavePublished(domainEvent);
    }
}