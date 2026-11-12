package tn.esprit.sanad.resources.web;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

class StatusControllerTest {

    @Test
    void statusReportsServiceUp() {
        Map<String, Object> body = new StatusController().status();
        assertEquals("UP", body.get("status"));
        assertEquals("resources-service", body.get("service"));
    }
}
