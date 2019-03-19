package learn.agile.demos.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import learn.agile.demos.DemoApplication;
import learn.agile.demos.controllers.CalculatorController;

/**
 
 * <p>
 * This tests the controller. It autowires the controller using Spring and verifies that it works
 * as expected. This is different than the service level unit test that are run directly against
 * the class without starting up Spring.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculatorControllerIT {

    @Autowired
    CalculatorController adderController;

    /**
     * @throws Exception
     */
    @Test
    public void testAdder() throws Exception {
        assertEquals(2, adderController.adder(1, 1));
        assertEquals(3, adderController.adder(2, 1));
        assertEquals(1000, adderController.adder(999, 1));
    }
}