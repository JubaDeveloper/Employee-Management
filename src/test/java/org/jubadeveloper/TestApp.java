package org.jubadeveloper;

import org.jubadeveloper.entitie.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestApp {
    @Autowired
    Main main = null;
    @Autowired
    TestRestTemplate restTemplate;
    @Value("${local.server.port}")
    int port;

    @Test
    public void load () {
        assertNotNull(main);
    }

    @Test
    public void shouldLoadInitialEmployee () {
        // Fetching the employees
        String url = "http://localhost:" + port + "/";
    }
}
