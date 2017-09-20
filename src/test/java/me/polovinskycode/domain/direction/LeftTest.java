package me.polovinskycode.domain.direction;

import me.polovinskycode.domain.model.Position;
import me.polovinskycode.domain.type.Compass;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeftTest {

    private Left left;

    @Before
    public void setUp() throws Exception {
        left = new Left();
    }

    @Test
    public void move_withCommand_L_settedUp_North_shouldReturnPosition() throws Exception {
        Position position = new Position();
        position.setDirection(Compass.NORTH);
        left.move(position);
        Assert.assertThat(position.getDirection(), Matchers.is(Compass.WEST));
    }

    @Test
    public void move_withCommand_L_settedUp_South_shouldReturnPosition() throws Exception {
        Position position = new Position();
        position.setDirection(Compass.SOUTH);
        left.move(position);
        Assert.assertThat(position.getDirection(), Matchers.is(Compass.EAST));
    }

    @Test
    public void move_withCommand_L_settedUp_East_shouldReturnPostion() throws Exception {
        Position position = new Position();
        position.setDirection(Compass.EAST);
        left.move(position);
        Assert.assertThat(position.getDirection(), Matchers.is(Compass.NORTH));
    }

    @Test
    public void move_withCommand_L_settedUp_West_shouldReturnPosition() throws Exception {
        Position position = new Position();
        position.setDirection(Compass.WEST);
        left.move(position);
        Assert.assertThat(position.getDirection(), Matchers.is(Compass.SOUTH));
    }
}