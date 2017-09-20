package me.polovinskycode.domain.model;

import me.polovinskycode.domain.type.Compass;

import static me.polovinskycode.domain.type.Compass.NORTE;

public class Position {

    private int x;
    private int y;
    private int z;
    private Compass compass;

    public Position() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.compass = NORTE;
    }

    public Position(int x, int y, int z) {
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Compass getDirection() {
        return compass;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public void setDirection(Compass compass) {
        this.compass = compass;
    }
}
