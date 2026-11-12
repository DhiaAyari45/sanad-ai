# Ressources & Approvisionnement — `resources-service`

**Responsable :** Dhia Ayari

Microservice Spring Boot (port **8084**) qui gère le catalogue de médicaments, les structures de santé, les stocks et leurs mouvements, les campagnes et les dons.

| Élément | Choix |
|---|---|
| Base | PostgreSQL `sanad_resources` (mouvements, dons et campagnes cohérents, verrou optimiste sur `Stock`) |
| Cache | Redis (`DisponibiliteCache`, lecture rapide de la disponibilité) |
| Communication | REST via le Gateway, OpenFeign pour les appels internes, Kafka pour les événements |
| Conception | `Documentation/Diagrams/uml/09-cu-ressources.png`, `10-classes-ressources.png` |
| Contrats | `Documentation/Contracts/rest-api.md`, `Documentation/Contracts/kafka-topics.md` |

## Lancer

Prérequis : JDK 17, PostgreSQL (base `sanad_resources`), Redis.

```bash
./mvnw spring-boot:run
curl http://localhost:8084/api/resources/status
```

Variables utiles : `POSTGRES_HOST`, `DB_USER`, `DB_PASSWORD`, `REDIS_HOST`, `KAFKA_BOOTSTRAP`, `EUREKA_URL`, `KEYCLOAK_ISSUER`.

État : projet initialisé (route de statut, sécurité JWT, configuration). La logique métier sera ajoutée après la validation de la conception.
