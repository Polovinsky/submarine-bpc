package me.polovinskycode.domain.direction;

import me.polovinskycode.domain.model.Position;
import me.polovinskycode.domain.type.Compass;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UpTest {

    private Up up;

    @Before
    public void setUp() throws Exception {
        up = new Up();
    }

    @Test
    public void move_withCommand_U_settedUp_North_shouldReturnPosition() throws Exception {
        Position position = new Position();
        position.setDirection(Compass.NORTH);
        position.setZ(0);

        up.move(position);
        Assert.assertThat(position.getZ(), Matchers.is(1));
    }

    @Test
    public void move_withCommand_U_withoutLeaving_shouldReturnPosition() throws Exception {
        Position position = new Position();

        up.move(position);
        Assert.assertThat(position.getZ(), Matchers.is(1));
    }
}