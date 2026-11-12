package tn.esprit.sanad.resources.web;

import java.time.Instant;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Route technique de statut : 200 lorsque le service est joignable. */
@RestController
public class StatusController {

    static final String SERVICE = "resources-service";

    @GetMapping("/api/resources/status")
    public Map<String, Object> status() {
        return Map.of(
                "service", SERVICE,
                "context", "Ressources & Approvisionnement",
                "status", "UP",
                "timestamp", Instant.now().toString());
    }
}
