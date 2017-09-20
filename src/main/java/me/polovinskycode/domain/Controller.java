package me.polovinskycode.domain;

import me.polovinskycode.domain.direction.*;
import me.polovinskycode.domain.model.Position;

import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.stream;

public class Controller {

    public final Map<String, Direction> directions = new HashMap<String, Direction>() {{
        put("L", new Left());
        put("R", new Right());
        put("U", new Up());
        put("D", new Down());
        put("M", new Direct());
    }};

    public Position toMove(String command) {
        String[] letters = command.split("");
        Position position = new Position();

        stream(letters).forEach( letter ->
                captureMove(letter).move(position));

        return position;
    }

    private final Direction captureMove(String direction) {
        return directions.get(direction);
    }
}
