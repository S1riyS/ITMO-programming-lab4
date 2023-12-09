package org.siriys;

public abstract class Surroundings {
    private String type;

    Surroundings(String type) {
        this.type = type;
    }

    public static class Tree extends Surroundings {
        private final String color;

        public Tree(String color) {
            super("Plant");
            this.color = color;
        }

        @Override
        public String toString() {
            return "Tree {" + "color='" + this.color + '\'' + '}';
        }
    }
}
