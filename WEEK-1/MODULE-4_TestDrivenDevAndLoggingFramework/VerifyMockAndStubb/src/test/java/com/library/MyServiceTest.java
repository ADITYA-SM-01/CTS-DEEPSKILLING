package com.library;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class MyServiceTest {

    @Test
    public void testFetchWeather() {

        // Step 1: Create Mock Object
        ExternalAPI mockAPI = mock(ExternalAPI.class);

        // Step 2: Stub Method
        when(mockAPI.getData()).thenReturn("Sunny");

        // Step 3: Inject Mock into Service
        MyService service = new MyService(mockAPI);

        service.fetchData();
        verify(mockAPI).getData();
    }
}