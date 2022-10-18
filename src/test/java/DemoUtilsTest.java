package test.java;

import main.java.DemoUtils;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class DemoUtilsTest {

    @Test
    void testEqualsAndNotEquals() {
        //set up => create instance of the class to test
        DemoUtils demoUtils = new DemoUtils();

        int expected = 6;
        int unexpected = 8;

        // execute => call the method you want to test
        int actual = demoUtils.add(2, 4);

        // assert => check the actual result and verify that it is the expected result
        Assertions.assertEquals(expected, actual, "2+4 must be 6");
        Assertions.assertNotEquals(unexpected, actual, "2+4 must not be 8");
    }
}
