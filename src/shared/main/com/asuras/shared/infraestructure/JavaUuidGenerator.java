package com.asuras.shared.infraestructure;

import com.asuras.shared.domain.UuidGenerator;

import java.util.UUID;

public final class JavaUuidGenerator implements UuidGenerator {
    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }
}