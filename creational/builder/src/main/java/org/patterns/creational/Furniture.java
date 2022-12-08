package org.patterns.creational;

import lombok.Setter;

@Setter
public class Furniture {
    private String type;

    public static Furniture of(String type) {
        Furniture f = new Furniture();
        f.setType(type);
        return f;
    }

}
