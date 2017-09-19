package me.polovinskycode.domain;

import me.polovinskycode.domain.model.Position;

public class Controller {

    public Position move(String command) {

        Position position = new Position();
        for (int i = 0; i < command.length(); i++) {
            Character c = command.charAt(i);
            String character = getCharacter(c);

            if (character.equals("L")) {
                position.setX(position.getX() -1);
            }
        }

        return position;
    }

    private String getCharacter(Character c) {
        return new String(c.toString());
    }
}
