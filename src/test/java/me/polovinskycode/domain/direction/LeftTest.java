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
    public void move_withCommand_L_shouldReturnPosition() throws Exception {
        Position position = new Position();
        left.move(position);
        Assert.assertThat(position.getDirection(), Matchers.is(Compass.OESTE));
    }
}