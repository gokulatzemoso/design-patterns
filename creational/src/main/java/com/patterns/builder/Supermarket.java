package com.patterns.builder;

public class Supermarket {
    private Food food;
    private Furniture furniture;
    private String name;

    public Supermarket(Builder builder) {
        this.food = builder.food;
        this.furniture = builder.furniture;
        this.name = builder.name;
    }

    public static class Builder {
        private Food food;
        private Furniture furniture;
        private String name;
        public Builder(String name) {
            this.name = name;
        }

        public Builder withFood(Food food) {
            this.food = food;
            return this;
        }

        public Builder withFurniture(Furniture furniture) {
            this.furniture = furniture;
            return this;
        }

        public Supermarket build() {
            return new Supermarket(this);
        }
    }
}
