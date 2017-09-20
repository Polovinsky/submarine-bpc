package me.polovinskycode.domain.direction;

import me.polovinskycode.domain.model.Position;
import me.polovinskycode.domain.type.Compass;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RightTest {

    private Right right;
    private Left left;

    @Before
    public void setUp() throws Exception {
        right = new Right();
        left = new Left();
    }

    @Test
    public void move_withCommand_R_settedUp_North_shouldReturnPosition() throws Exception {

        Position position = new Position();
        position.setDirection(Compass.NORTH);
        right.move(position);
        Assert.assertThat(position.getDirection(), Matchers.is(Compass.EAST));
    }

    @Test
    public void move_withCommand_R_settedUp_East_shouldReturnPosition() throws Exception {
        Position position = new Position();
        position.setDirection(Compass.EAST);
        right.move(position);
        Assert.assertThat(position.getDirection(), Matchers.is(Compass.SOUTH));
    }

    @Test
    public void move_withCommand_R_settedUp_South_shouldReturnPosition() throws Exception {
        Position position = new Position();
        position.setDirection(Compass.SOUTH);
        right.move(position);
        Assert.assertThat(position.getDirection(), Matchers.is(Compass.WEST));
    }

    @Test
    public void move_withCommand_R_settedUp_West_shouldReturnPosition() throws Exception {
        Position position = new Position();
        position.setDirection(Compass.WEST);
        right.move(position);
        Assert.assertThat(position.getDirection(), Matchers.is(Compass.NORTH));
    }
}