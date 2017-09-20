package me.polovinskycode.domain;

import me.polovinskycode.domain.model.Position;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ControllerTest {

    private Controller controller;

    @Before
    public void setUp() throws Exception {
        controller = new Controller();
    }

    @Ignore
    @Test
    public void toMove_withCommandLine_shouldReturnPosition() throws Exception {
        Position position = controller.toMove("LMRDDMMUU");
        assertThat(position.toString(), is("-1 2 0 NORTE"));
    }
}