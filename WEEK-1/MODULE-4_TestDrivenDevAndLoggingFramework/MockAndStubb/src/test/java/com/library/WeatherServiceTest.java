package com.library;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class WeatherServiceTest {

    @Test
    public void testFetchWeather() {

        // Step 1: Create Mock Object
        ExternalAPI mockAPI = mock(ExternalAPI.class);

        // Step 2: Stub Method
        when(mockAPI.getWeather()).thenReturn("Sunny");

        // Step 3: Inject Mock into Service
        WeatherService service = new WeatherService(mockAPI);

        // Call Service
        String result = service.fetchWeather();

        // Verify Result
        assertEquals("Sunny", result);
    }
}