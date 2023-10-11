package com.asuras.apps.app_one.controller.module;

import com.asuras.apps.ApplicationTestCase;
import org.junit.jupiter.api.Test;

public class EntityModulePutControllerTestCase extends ApplicationTestCase {

    @Test
    void create_a_valid_non_existing_course() throws Exception {

        //assertRequest("PUT","/entities/1aab45ba-3c7a-4344-8936-78466eca77fa",201);
        assertRequestWithBody(
                "PUT",
                "/entities/1aab45ba-3c7a-4344-8936-78466eca77fa",
                "{\"name\": \"Nombre de prueba\", \"description\": \"Descripción de prueba\"}",
                201
        );
    }
}
