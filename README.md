# Sanad AI

> Module AWD — Validation 1 — ESPRIT 2026–2027

## Objectif

Sanad AI coordonne l'accès aux praticiens volontaires et aux médicaments en zone de crise. Patients, structures de santé, ONG et coordinateurs terrain disposent d'un point d'accès commun pour réserver une consultation, vérifier une disponibilité et signaler un besoin. L'application repose sur une architecture microservices (Angular, Spring Cloud Gateway, Eureka, Config Server, Keycloak, Kafka, FastAPI, Docker) et reste utilisable en mode dégradé lorsqu'un service est indisponible.

## Équipe et microservices

| Microservice | Dossier | Responsable |
|---|---|---|
| Accréditation & Habilitation | `Backend/accreditation-service/` | Mohamed Amine Jery |
| Consultation | `Backend/consultation-service/` | Rayen Haddad |
| Dossier médical | `Backend/medical-record-service/` | Chahine Tabbabi |
| Ressources & Approvisionnement | `Backend/resources-service/` | Dhia Ayari |
| Urgences & Coordination terrain | `Backend/emergency-service/` | Firas Khatib |
| AI Service | `Backend/ai-service/` | Aziz Rajhi |
| Notification | `Backend/notification-service/` | Équipe |

## Structure

Chaque responsable ajoute son dossier sous `Backend/` (voir le tableau ci-dessus). `Frontend/` et `Backend/Infrastructure/` (Gateway, Eureka, Config Server, Keycloak, Docker) sont ajoutés par l'équipe.

```
sanad-ai/
├── Backend/
│   └── resources-service/        Ressources & Approvisionnement (Spring Boot, :8084)
└── Documentation/
    ├── Sanad-AI-Documentation-complete.docx
    ├── Diagrams/                 Diagrammes UML et architecture
    ├── Presentation/             Support de la validation
    └── Contracts/                Contrats REST et événements Kafka
```

## Documentation

- Dossier technique : [Documentation/Sanad-AI-Documentation-complete.docx](Documentation/Sanad-AI-Documentation-complete.docx)
- Diagrammes UML : [Documentation/Diagrams/Sanad-AI-Diagrammes-UML.pdf](Documentation/Diagrams/Sanad-AI-Diagrammes-UML.pdf)
- Architecture : [Documentation/Diagrams/architecture.md](Documentation/Diagrams/architecture.md)
- Suivi des tâches : [GitHub Projects](https://github.com/users/DhiaAyari45/projects/1)

## Contribuer

Chaque membre pousse son propre travail sur son microservice.

```bash
git clone https://github.com/DhiaAyari45/sanad-ai.git
cd sanad-ai
git switch -c feat/<service>            # ex. feat/consultation-service
# travail dans Backend/<service>/
git add Backend/<service>
git commit -m "Initialiser le projet <service>"
git push -u origin feat/<service>
```

Ouvrir ensuite une pull request de `feat/<service>` vers `main`, relue par un autre membre avant la fusion. Écrire `Closes #N` dans la pull request pour fermer l'issue correspondante.
