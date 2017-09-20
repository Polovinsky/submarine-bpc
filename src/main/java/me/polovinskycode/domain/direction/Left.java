package me.polovinskycode.domain.direction;

import me.polovinskycode.domain.model.Position;

import static me.polovinskycode.domain.type.Compass.*;

public class Left implements Direction {

    @Override
    public void move(Position position) {

        if (position.getDirection().equals(NORTH)) {
            position.setDirection(WEST);
        } else if (position.getDirection().equals(SOUTH)) {
            position.setDirection(EAST);
        } else if (position.getDirection().equals(EAST)) {
            position.setDirection(NORTH);
        } else if (position.getDirection().equals(WEST)) {
            position.setDirection(SOUTH);
        }
    }
}
