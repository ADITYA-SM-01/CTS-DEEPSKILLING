package com.library;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    void testApp(){
        App app = new App();
        int actualResult = app.divide(10,5);
        int expectedResult = 2;
        assertEquals(expectedResult,actualResult);

    }
}
