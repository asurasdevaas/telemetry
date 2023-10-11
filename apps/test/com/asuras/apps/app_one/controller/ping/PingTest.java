package com.asuras.apps.app_one.controller.ping;
import org.junit.jupiter.api.Test;
import com.asuras.apps.ApplicationTestCase;

import static org.junit.jupiter.api.Assertions.*;

final class PingTest extends ApplicationTestCase {
    @Test
    void check_the_app_is_working_ok() throws Exception {
        assertResponse("/ping", 200, "{'status':'ok'}");
    }

}