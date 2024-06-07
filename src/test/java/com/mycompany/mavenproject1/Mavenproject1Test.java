/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class Mavenproject1Test {
    
    private Mavenproject1 math = new Mavenproject1();

    @Test
    public void testAdd() {
        assertEquals(5, math.add(2, 3), "Testing addition");
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, math.subtract(2, 3), "Testing subtraction");
    }

    @Test
    public void testMultiply() {
        assertEquals(6, math.multiply(2, 3), "Testing multiplication");
    }

    @Test
    public void testDivide() {
        assertEquals(2, math.divide(6, 3), "Testing division");
        assertThrows(ArithmeticException.class, () -> math.divide(1, 0), "Division by zero should throw an ArithmeticException");
    }
}
