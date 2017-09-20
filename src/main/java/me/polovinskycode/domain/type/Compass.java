package me.polovinskycode.domain.type;

public enum Compass {

    NORTE("NORTE"),
    SUL("SUL"),
    LESTE("LESTE"),
    OESTE("OESTE");

    private String description;

    Compass(String description) {
        this.description = description;
    }
}
