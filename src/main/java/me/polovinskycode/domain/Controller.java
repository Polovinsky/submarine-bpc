package me.polovinskycode.domain;

import me.polovinskycode.domain.model.Position;

public class Controller {

    public Position move(String command) {

        Position position = new Position();
        for (int i = 0; i < command.length(); i++) {
            Character c = command.charAt(i);
            String character = getCharacter(c);







            /*switch (position.getDirection()) {
                case "NORTE":
                    position.setY(position.getY() + 1);
                    break;
                case "SUL":
                    position.setY(position.getY() - 1);
                    break;
                case "LESTE":
                    position.setX(position.getX() + 1);
                    break;
                case "OESTE":
                    position.setX(position.getX() - 1);
                    break;
                default:
                    break;*/

        }

        return position;
    }

    private String getCharacter(Character c) {
        return new String(c.toString());
    }
}
