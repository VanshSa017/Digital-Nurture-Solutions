package com.mockito;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest2 {

    @Test
    public void testVerifyInteraction() {

        // Step 1: Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Create service using the mock
        MyService service = new MyService(mockApi);

        // Step 3: Call the method
        service.fetchData();

        // Step 4: Verify the interaction
        verify(mockApi).getData();
    }
}
