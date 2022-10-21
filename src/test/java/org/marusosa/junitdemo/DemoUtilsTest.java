package org.marusosa.junitdemo;

import org.junit.jupiter.api.*;
import org.marusosa.junitdemo.DemoUtils;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.DisplayName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Random.class)
public class DemoUtilsTest {
    DemoUtils demoUtils;

    @BeforeEach
    void setUpBeforeEach() {
        demoUtils = new DemoUtils();
    }

    @Test
    @DisplayName("Equals and not equals")
    @Order(1) //we can also use negative values
    void testEqualsAndNotEquals() {
        assertEquals(6, demoUtils.add(2,4), "2+4 must be 6");
        assertNotEquals(8, demoUtils.add(2,4), "2+4 must not be 8");
    }

    @Test
    @DisplayName("Null and not null")
    @Order(0)
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
    @Order(30)
    void testTrueFalse() {
        int gradeOne = 10;
        int gradeTwo = 5;

        assertTrue(demoUtils.isGreater(gradeOne,gradeTwo));
        assertFalse(demoUtils.isGreater(gradeTwo,gradeOne));
    }

    @DisplayName("Array equals")
    @Test
    void testArrayEquals() {
        String[] stringArray = {"A", "B", "C"};

        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(),
                "Arrays should be the same");
    }

    @DisplayName("Iterable equeals")
    @Test
    void testIterableEquals() {
        List<String> theList = List.of("luv", "2", "code");
        assertIterableEquals(theList, demoUtils.getAcademyInList(),
                "Expected list should be same as actual list");
    }

    @DisplayName("Lines match")
    @Test
    @Order(50)
    void testLinesMatch() {
        List<String> theList = List.of("luv", "2", "code");
        assertLinesMatch(theList, demoUtils.getAcademyInList(),
                "Lines should match.");
    }

    @DisplayName("Throw and does not throw")
    @Test
    void testThrowsAndDoesNotThrow() {
        assertThrows(Exception.class, () -> {
            demoUtils.throwException(-1);
            }, "Should throw an exception"
        );

        assertDoesNotThrow(() -> {
            demoUtils.throwException(1);
        }, "Should not throw exception");
    }

    @DisplayName("Timeout")
    @Test
    void testTimeOut() {
        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
            demoUtils.checkTimeout();
        }, "method should execute in 3 seconds (or less)");
    }

    @DisplayName("Multiply")
    @Test
    void testMultiply(){
        assertEquals(12, demoUtils.multiply(4,3), "4+3 must be 12");
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
