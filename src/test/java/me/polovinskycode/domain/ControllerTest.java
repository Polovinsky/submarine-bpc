package me.polovinskycode.domain;

import me.polovinskycode.domain.model.Position;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class ControllerTest {

    @Test
    public void move_withCommandLine_L_shouldReturnPositionSubmarine() throws Exception {
        Controller controller = new Controller();
        Position position = controller.move("L");
        Assert.assertThat(position.getX(), Matchers.equalTo(-1));
    }

    @Test
    public void move_withCommandLine_R_shouldReturnPositionSubmarine() throws Exception {
        Controller controller = new Controller();
        Position position = controller.move("R");
        Assert.assertThat(position.getX(), Matchers.equalTo(1));
    }
}