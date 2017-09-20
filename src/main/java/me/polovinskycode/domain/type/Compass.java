package me.polovinskycode.domain.type;

public enum Compass {

    NORTH("NORTH"),
    SOUTH("SOUTH"),
    EAST("EAST"),
    WEST("WEST");

    private String description;

    Compass(String description) {
        this.description = description;
    }
}
