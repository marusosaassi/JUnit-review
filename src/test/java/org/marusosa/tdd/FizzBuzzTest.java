package org.marusosa.tdd;

import org.junit.jupiter.api.*;

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

}
