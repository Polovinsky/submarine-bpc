package me.polovinskycode.domain.model;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class PositionTest {

    @Test
    public void move_withCommandL_shouldReturnPosition() throws Exception {
        Integer x = -1;
        Integer y = 2;
        Integer z = 0;

        Position position = new Position(x, y, z);
        assertThat(position.toString(), equalTo("-1 2 0"));
    }

    @Test
    public void move_withoutCommand_shoulReturnPosition() throws Exception {
        Integer x = 0;
        Integer y = 0;
        Integer z = 0;

        Position position = new Position(x, y, z);
        assertThat(position.toString(), equalTo("0 0 0"));
    }
}