package me.polovinskycode.domain.direction;

import me.polovinskycode.domain.model.Position;

import static me.polovinskycode.domain.type.Compass.NORTE;
import static me.polovinskycode.domain.type.Compass.OESTE;

public class Left implements Direction {

    @Override
    public void move(Position position) {

        if (position.getDirection().equals(NORTE)) {
            position.setDirection(OESTE);
        }
    }
}
