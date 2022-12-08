package org.patterns.creational;

import lombok.Setter;

@Setter
public class Food {
    private String type;

    public static Food of(String type) {
        Food f = new Food();
        f.setType(type);
        return f;
    }
}
