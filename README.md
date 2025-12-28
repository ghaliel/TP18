# TP18 — Service gRPC de gestion des comptes 🏦

**Description**

Service minimal en Java (Spring Boot + gRPC) pour gérer des comptes bancaires (CRUD + statistiques). Conçu pour l'apprentissage et les tests locaux avec une base H2 en mémoire.

---

## Fonctionnalités principales ✅

- CRUD complet pour les comptes (Create, Read, Update, Delete)
- Point d'agrégation pour **total**, **moyenne** et **nombre** des soldes
- API gRPC définie par `src/main/proto/CompteService.proto`
- Base H2 en mémoire pour développement et tests

---

## Pré-requis 🧰

- Java 17+
- Maven 3.6+
- Un client gRPC (BloomRPC, Evans, Postman)

---

## Installation & exécution 🚀

1. Cloner le dépôt

```bash
git clone <repo-url>
cd tp18
```

2. Construire

```bash
mvn clean install
```

3. Lancer

```bash
mvn spring-boot:run
```

Services disponibles:

- HTTP: http://localhost:8080
- gRPC: localhost:9090
- H2 Console: http://localhost:8080/h2-console

---

## Configuration ⚙️

Fichier: `src/main/resources/application.properties`

Principales propriétés:

- `server.port=8080`
- `grpc.server.port=9090`
- `spring.datasource.url=jdbc:h2:mem:testdb`

---

## Utiliser l'API gRPC 📡

- Le fichier proto est dans `src/main/proto/CompteService.proto`.
- Importez ce fichier dans votre client gRPC et connectez-vous sur `localhost:9090`.

Méthodes principales:

- `AllComptes` — récupérer tous les comptes
- `CompteById` — récupérer un compte par id
- `SaveCompte` — créer ou mettre à jour un compte
- `DeleteCompte` — supprimer un compte
- `TotalSolde` — statistiques sur les soldes

---

## Structure du projet 📁

```
src/main/
 ├─ java/.../grpc/        # code applicatif
 ├─ proto/                # CompteService.proto
 └─ resources/            # application.properties
```
## Captures D ecran  

<img width="1631" height="1007" alt="AllComptes" src="https://github.com/user-attachments/assets/02aae1f8-c250-4670-9cfa-0a03f1e264d8" />



<img width="1625" height="1010" alt="SaveCompte" src="https://github.com/user-attachments/assets/5fe05eba-4e5a-4f9e-a491-79bc85d410c8" />


---

## Tests & Debug 🧪

- Utilisez PostMan/BloomRPC pour tester les endpoints gRPC.
- Pour la DB, ouvrez la console H2 et vérifiez les tables.

---

## Contributions 👥

Proposez des améliorations via PR. Pour toute modification, ajoutez une brève description et, si possible, un test.

---
