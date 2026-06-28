package com.library;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

public class AppTest {

    private App app;

    // Setup Method
    @Before
    public void setUp() {
        System.out.println("Setting up Calculator...");
        app = new App();
    }

    // Teardown Method
    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        app = null;
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = app.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testSubtraction() {

        // Arrange
        int a = 20;
        int b = 5;

        // Act
        int result = app.subtract(a, b);

        // Assert
        assertEquals(15, result);
    }
}