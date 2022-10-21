package org.marusosa.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTest {

    @DisplayName("divisible by 3")
    @Test
    @Order(1)
    void testForDivisibleByThree() {
        //fail("fail");
        String expected = "Fizz";
        assertEquals(expected, FizzBuzz.compute(3), "should return Fizz");
    }

    @DisplayName("divisible by 5")
    @Test
    @Order(2)
    void testForDivisibleByFive() {
        String expected = "Buzz";
        assertEquals(expected, FizzBuzz.compute(5), "should return Buzz");
    }

    @DisplayName("divisible by 3 and 5")
    @Test
    @Order(3)
    void testForDivisibleByThreeAndFive() {
        String expected = "FizzBuzz";
        assertEquals(expected, FizzBuzz.compute(15), "should return FizzBuzz");
    }

    @DisplayName("Not divisible by 3 or 5")
    @Test
    @Order(4)
    void testForNotDivisibleByThreeOrFive() {
        String expected = "1";
        assertEquals(expected, FizzBuzz.compute(1), "should return 1");
    }

    @DisplayName("Testing with small data file")
    @ParameterizedTest(name="value={0}, expected={1}")
    //because we are passing parameters for this test (through an csv file)
    @CsvFileSource(resources = "/small-test-data.csv")
    @Order(5)
    void testWithSmallDataFile(int value, String expected) {
        assertEquals(expected, FizzBuzz.compute(value));
        //behind the scenes, JUnit will run the test multiple times and supply the data
        // for the parameters. JUnit does the looping.
    }

    @DisplayName("Testing with medium data file")
    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources = "/medium-test-data.csv")
    @Order(6)
    void testWithMediumDataFile(int value, String expected) {
        assertEquals(expected, FizzBuzz.compute(value));
    }

    @DisplayName("Testing with large data file")
    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources = "/large-test-data.csv")
    @Order(7)
    void testWithLargeDataFile(int value, String expected) {
        assertEquals(expected, FizzBuzz.compute(value));
    }

}
