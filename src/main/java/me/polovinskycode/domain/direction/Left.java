package me.polovinskycode.domain.direction;

import me.polovinskycode.domain.model.Position;

import static me.polovinskycode.domain.type.Compass.NORTH;
import static me.polovinskycode.domain.type.Compass.WEST;

public class Left implements Direction {

    @Override
    public void move(Position position) {

        if (position.getDirection().equals(NORTH)) {
            position.setDirection(WEST);
        }
    }
}
