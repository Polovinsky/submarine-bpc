package me.polovinskycode.domain;

import me.polovinskycode.domain.model.Position;

public class Controller {

    public Position move(String command) {

        Position position = new Position();
        for (int i = 0; i < command.length(); i++) {
            String character = getCharacter(command, i);

            if (character.equals("L")) {
                position.setX(position.getX() -1);
            }
        }

        return position;
    }

    private String getCharacter(String command, int i) {
        Character c = command.charAt(i);
        return new String(c.toString());
    }
}
