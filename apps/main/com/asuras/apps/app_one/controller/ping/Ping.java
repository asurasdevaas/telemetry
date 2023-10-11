package com.asuras.apps.app_one.controller.ping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public final class Ping {

    @GetMapping("/ping")
    public HashMap<String, String> index() {
        HashMap<String, String> status = new HashMap<>();
        status.put("status", "ok");

        return status;
    }
}