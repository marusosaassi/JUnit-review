import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class DemoUtilsTest {
    DemoUtils demoUtils;

    @BeforeEach
    void setUpBeforeEach() {
        demoUtils = new DemoUtils();
    }

    @Test
    //@DisplayName("Equals and not equals")
    void test_Equals_And_Not_Equals() {
        //set up => create instance of the class to test
        //DemoUtils demoUtils = new DemoUtils();

        /*int expected = 6;
        int unexpected = 8;

        // execute => call the method you want to test
        int actual = demoUtils.add(2, 4);

        // assert => check the actual result and verify that it is the expected result
        Assertions.assertEquals(expected, actual, "2+4 must be 6");
        Assertions.assertNotEquals(unexpected, actual, "2+4 must not be 8");*/

        //minimizing our code:
        assertEquals(6, demoUtils.add(2,4), "2+4 must be 6");
        assertNotEquals(8, demoUtils.add(2,4), "2+4 must not be 8");


    }

    @Test
    //@DisplayName("Null and not null")
    void test_Null_And_Not_Null() {
        //DemoUtils demoUtils = new DemoUtils();

        String str1 = null;
        String str2 = "marusosa";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

    /*@AfterEach
    void tearDownAfterEach() {
        System.out.println("Running @AfterEach");
        System.out.println();
    }

    @BeforeAll
    static void setUpBeforeEachClass() {
        System.out.println("@BeforeAll executes only once before all test methods");
        // by default, methods must be static
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("@AfterAll executes only once after all test methods");
        // by default, methods must be static
    }*/
}
