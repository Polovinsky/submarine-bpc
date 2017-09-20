package me.polovinskycode.domain.direction;

import me.polovinskycode.domain.model.Position;
import me.polovinskycode.domain.type.Compass;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DirectTest {

    private Direct direct;

    @Before
    public void setUp() throws Exception {
        direct = new Direct();
    }

    @Test
    public void move_withCommand_M_settedUp_North_shouldPositonPlus_1_InDirectionY() throws Exception {
        Position position = new Position();
        position.setDirection(Compass.NORTH);
        position.setZ(0);
        position.setX(0);
        position.setY(0);

        direct.move(position);
        Assert.assertThat(position.getY(), Matchers.is(1));
        Assert.assertThat(position.getX(), Matchers.is(0));
        Assert.assertThat(position.getZ(), Matchers.is(0));
        Assert.assertThat(position.getDirection(), Matchers.is(Compass.NORTH));
    }

    @Test
    public void move_withCommand_M_settedUp_East_shouldPositonPlus_1_InDirectionY() throws Exception {
        Position position = new Position();
        position.setDirection(Compass.EAST);
        position.setZ(0);
        position.setX(0);
        position.setY(0);

        direct.move(position);
        Assert.assertThat(position.getY(), Matchers.is(0));
        Assert.assertThat(position.getX(), Matchers.is(1));
        Assert.assertThat(position.getZ(), Matchers.is(0));
        Assert.assertThat(position.getDirection(), Matchers.is(Compass.EAST));
    }

    @Test
    public void move_withCommand_M_settedUp_South_shouldPositonDecrease_1_InDirectionY() throws Exception {
        Position position = new Position();
        position.setDirection(Compass.SOUTH);
        position.setZ(0);
        position.setX(0);
        position.setY(0);

        direct.move(position);
        Assert.assertThat(position.getY(), Matchers.is(-1));
        Assert.assertThat(position.getX(), Matchers.is(0));
        Assert.assertThat(position.getZ(), Matchers.is(0));
        Assert.assertThat(position.getDirection(), Matchers.is(Compass.SOUTH));
    }

    @Test
    public void move_withCommand_M_settedUp_West_shouldPositonDecrease_1_InDirectionY() throws Exception {
        Position position = new Position();
        position.setDirection(Compass.WEST);
        position.setZ(0);
        position.setX(0);
        position.setY(0);

        direct.move(position);
        Assert.assertThat(position.getY(), Matchers.is(0));
        Assert.assertThat(position.getX(), Matchers.is(-1));
        Assert.assertThat(position.getZ(), Matchers.is(0));
        Assert.assertThat(position.getDirection(), Matchers.is(Compass.WEST));
    }
}