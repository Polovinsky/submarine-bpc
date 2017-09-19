package me.polovinskycode.domain.model;

public class Position {

    private Integer x;
    private Integer y;
    private Integer z;

    public Position(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(x)
                .append(" ")
                .append(y)
                .append(" ")
                .append(z)
                .toString();
    }
}
