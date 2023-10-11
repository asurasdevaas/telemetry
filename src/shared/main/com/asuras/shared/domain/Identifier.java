package com.asuras.shared.domain;

import java.util.UUID;
import java.util.Objects;

public class Identifier {

    private String value;

    public Identifier(String value){
        ensureValidUuid(value);
        this.value = value;
    }


    protected Identifier() {
        this.value = null;
    }

    private void ensureValidUuid(String value) {
        UUID.fromString(value);
    }

    public String value(){
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Identifier that = (Identifier) o;
        return value.equals(that.value);
    }

}
