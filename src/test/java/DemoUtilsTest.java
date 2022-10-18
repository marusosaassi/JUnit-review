import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DemoUtilsTest {
    DemoUtils demoUtils;

    @BeforeEach
    void setUpBeforeEach() {
        demoUtils = new DemoUtils();
    }

    @Test
    @DisplayName("Equals and not equals")
    void testEqualsAndNotEquals() {
        assertEquals(6, demoUtils.add(2,4), "2+4 must be 6");
        assertNotEquals(8, demoUtils.add(2,4), "2+4 must not be 8");
    }

    @Test
    @DisplayName("Null and not null")
    void testNullAndNotNull() {
        String str1 = null;
        String str2 = "marusosa";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

    @DisplayName("Same and not same")
    @Test
    void testSameAndNotSame() {
        String str = "Test same and not same";
        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(),
                "Object should refer to same object");
        assertNotSame(str, demoUtils.getAcademy(), "" +
                "Objects should not refer to same object");
    }

    @DisplayName("True and false test")
    @Test
    void testTrueFalse() {
        int gradeOne = 10;
        int gradeTwo = 5;

        assertTrue(demoUtils.isGreater(gradeOne,gradeTwo));
        assertFalse(demoUtils.isGreater(gradeTwo,gradeOne));
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
