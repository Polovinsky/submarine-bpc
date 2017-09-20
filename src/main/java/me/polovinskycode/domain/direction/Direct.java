package me.polovinskycode.domain.direction;

import me.polovinskycode.domain.model.Position;
import me.polovinskycode.domain.type.Compass;

import static me.polovinskycode.domain.type.Compass.EAST;
import static me.polovinskycode.domain.type.Compass.SOUTH;
import static me.polovinskycode.domain.type.Compass.WEST;

public class Direct implements Direction {

    @Override
    public void move(Position position) {

        if (position.getDirection().equals(Compass.NORTH)) {
            position.setY(position.getY() + 1);
        } else if (position.getDirection().equals(EAST)) {
            position.setX(position.getX() + 1);
        } else if (position.getDirection().equals(SOUTH)) {
            position.setY(position.getY() - 1);
        } else if (position.getDirection().equals(WEST)) {
            position.setX(position.getX() - 1);
        }
    }
}
