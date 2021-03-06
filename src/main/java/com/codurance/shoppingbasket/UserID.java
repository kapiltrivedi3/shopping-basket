package com.codurance.shoppingbasket;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

public class UserID {

    private String id;

    public UserID(String id) {
        this.id = id;
    }

    public String value() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        return reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return "UserID{" +
                "id='" + id + '\'' +
                '}';
    }
}
