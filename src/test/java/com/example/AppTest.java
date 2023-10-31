package org.example;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class AppTest {

    @Test
    public void testAppCreation() {
        App app = new App();
        assertNotNull(app); // Check that an instance of the App class can be created
    }

    // Add more test methods to test specific functionality of the App class
}