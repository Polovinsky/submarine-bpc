package me.polovinskycode.domain.direction;

import me.polovinskycode.domain.model.Position;
import me.polovinskycode.domain.type.Compass;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DownTest {

    private Down down;

    @Before
    public void setUp() throws Exception {
        down = new Down();
    }

    @Test
    public void move_withCommand_D_setted_North_shouldReturnPosition() throws Exception {
        Position position = new Position();
        position.setDirection(Compass.NORTH);
        position.setZ(0);

        down.move(position);
        Assert.assertThat(position.getZ(), Matchers.is(-1));
    }
}