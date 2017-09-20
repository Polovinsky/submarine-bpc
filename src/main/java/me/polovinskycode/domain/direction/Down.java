package me.polovinskycode.domain.direction;

import me.polovinskycode.domain.model.Position;

public class Down implements Direction {

    @Override
    public void move(Position position) {
        position.setZ(position.getZ() - 1);
    }
}
