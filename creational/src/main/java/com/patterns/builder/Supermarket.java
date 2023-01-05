package com.patterns.builder;

public class Supermarket {
    private Food food;
    private Furniture furniture;
    private String name;

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
    }
}
