# Netflix Assignment - No Database

## Introductie
Je gaat een eenvoudige CRUD-backend voor een Netflix-achtige applicatie bouwen in Java met Spring Boot. De service draait volledig in-memory (zonder echte database), alle data is "hard coded" tijdens runtime en het wegschrijven van data is niet mogelijk. De backend biedt basisfunctionaliteit om films te beheren en gebruikersratings op te slaan.

## 1. API-specificatie

### GET /films
**Doel**
Haalt alle films op.

**Request**
Geen body of parameters.

**Response (200 OK)**
```json
{
  "films": [
    {
      "id": "123",
      "titel": "Inception",
      "beschrijving": "Een droom-in-een-droom heistfilm",
      "genre": "Sci-fi",
      "releasedatum": "2010-07-16"
    },
    {
      "id": "456",
      "titel": "Parasite",
      "beschrijving": "Kritisch drama over klassenverschillen",
      "genre": "Drama",
      "releasedatum": "2019-05-30"
    }
    // …
  ]
}
```

### GET /films/{id}
**Doel**
Levert de details van één film.

**Request**
Path-parameter {id}. Geen body.

**Response (200 OK)**
```json
{
  "id": "123",
  "titel": "Inception",
  "beschrijving": "Een droom-in-een-droom heistfilm",
  "genre": "Sci-fi",
  "releasedatum": "2010-07-16",
  "gemiddeldeRating": 4.7,
  "aantalRatings": 1250
}
```

### POST /films
**Doel**
Voegt een nieuwe film toe.

**Request**
```json
{
  "titel": "Nieuwe Film",
  "beschrijving": "Korte omschrijving van de film",
  "genre": "Komedie",
  "releasedatum": "2025-06-01"
}
```

**Response (201 Created)**
```json
{
  "id": "789",
  "titel": "Nieuwe Film",
  "beschrijving": "Korte omschrijving van de film",
  "genre": "Komedie",
  "releasedatum": "2025-06-01"
}
```

### GET /films/populair?limit=10&datum=YYYY-MM-DD
**Doel**
Toont de populairste films op een gegeven dag.

**Request**
Query-parameters:
- limit (optioneel, standaard 10)
- datum (optioneel, standaard "vandaag", in YYYY-MM-DD)

**Response (200 OK)**
```json
{
  "datum": "2025-06-10",
  "limit": 10,
  "populairsteFilms": [
    {
      "id": "456",
      "titel": "Parasite",
      "gemiddeldeRating": 4.9,
      "aantalRatingsOpDatum": 120
    },
    {
      "id": "123",
      "titel": "Inception",
      "gemiddeldeRating": 4.8,
      "aantalRatingsOpDatum": 95
    }
    // …
  ]
}
```

### POST /films/{id}/rating
**Doel**
Voegt een 1–5-sterren rating toe voor een film.

**Request**
Path-parameter {id}.
```json
{
  "userId": "user_001",           // optioneel  
  "score": 4,                     // integer 1–5  
  "timestamp": "2025-06-10T14:30Z" // optioneel, anders server-tijd  
}
```

**Response (201 Created)**
```json
{
  "ratingId": "r567",
  "filmId": "123",
  "userId": "user_001",
  "score": 4,
  "timestamp": "2025-06-10T14:30Z"
}
```

## 2. Over Spring Boot

Spring Boot is een opiniated webframework voor Java dat sterk gericht is op het snel en eenvoudig opzetten van productieklare applicaties.

- **Autoconfiguratie**: Herkent automatisch aanwezige bibliotheken en configureert beans en properties.
- **Standalone JAR**: Produceert één uitvoerbaar JAR met alle dependencies.
- **Embedded server**: Draait standaard op een ingebouwde Tomcat-server.
- **Starters**: Voegt met één dependency-omschrijving een complete set libraries toe.

## 3. Architectuur: Controller-Service-Repository pattern

Spring hanteert vaak het controller-service-repository-patroon om code te scheiden:

- **Controller**: Neemt HTTP-verzoeken in ontvangst, valideert input en roept de service-laag aan.
- **Service**: Bevat alle business- en CRUD-logica. Hier maak je in-memory DTO's hard-coded aan en verwerk je data.
- **Repository**: Meestal verantwoordelijk voor data-toegang, maar in dit in-memory project kun je dit laagje leeg laten of simpelweg je lijsten/maps beheren in de service.

## 4. Architectuur en opbouw van de applicatie

### DTO-laag
Je werkt uitsluitend met DTO-klassen (Data Transfer Objects) voor Film en Rating. Deze bevatten alleen de velden die je in de API-contracten nodig hebt.
In de service-laag maak je exemplaren van deze DTO's hard-coded aan (bijv. `new FilmDto("123", "Inception", ...)`) en bewaar je ze in een lijst of map om terug te sturen bij GET-verzoeken.

### Service-laag
Bevat methodes zoals:
- `List<FilmDto> getAllFilms()`
- `FilmDto getFilmById(String id)`
- `FilmDto addFilm(FilmDto film)`
- `List<FilmDto> getPopulaireFilms(int limit, LocalDate datum)`
- `RatingDto addRating(String filmId, RatingDto rating)`

Deze methodes vullen de DTO's in-code en returnen ze; bij POST-verzoeken log je de ontvangen DTO met `System.out.println(...)`.

### Controller-laag
Definieer een klasse met `@RestController` en gebruik `@GetMapping` en `@PostMapping` om de bovenstaande service-methodes bereikbaar te maken onder de opgegeven URL's.

## 5. Annotaties en hun beschrijving

| Annotatie | Beschrijving |
|-----------|--------------|
| `@SpringBootApplication` | Integreert `@Configuration`, `@EnableAutoConfiguration` en `@ComponentScan`. Zet op de hoofdklasse om de app te activeren. |
| `@RestController` | Combineert `@Controller` en `@ResponseBody`: stuurt JSON terug. |
| `@GetMapping` | Shortcut voor GET-endpoints, bijv. `/films` of `/films/{id}`. |
| `@PostMapping` | Shortcut voor POST-endpoints, bijv. `/films` of `/films/{id}/rating`. |
| `@PathVariable` | Bindt een URL-pathsegment (zoals `{id}`) aan een methode-parameter. |
| `@RequestParam` | Bindt query-parameters (zoals `limit` en `datum`) aan methode-parameters. |
| `@RequestBody` | Deserialiseert JSON-body naar een DTO-object bij POST. |
| `@Autowired` | Injecteert automatisch beans (service in controller). |
| `@Service` | Markeert de service-laag-component. |
| `@Component` | Markeert een generieke Spring-bean (optioneel voor dit project). |

## 6. Project setup in IntelliJ IDEA

### Nieuw project aanmaken
1. Open IntelliJ IDEA
2. Klik op "New Project" of "File" → "New" → "Project"
3. Selecteer "Spring Initializr" uit de lijst aan de linkerkant
4. Configureer je project:
   - **Name**: Geef je project een naam (bijv. "netflix-backend")
   - **Build system**: Selecteer **Maven** of **Gradle** (Maven wordt aanbevolen voor beginners)
   - **Language**: Selecteer **Java**
   - **Java version**: Selecteer **Java 21**
   - **Package name**: Laat de standaard naam staan of pas aan naar wens
5. Klik op "Next"

### Dependencies selecteren
In het volgende scherm voeg je de benodigde dependencies toe:
1. Zoek naar **"Spring Web"** en selecteer deze
   - Dit voegt `spring-boot-starter-web` toe aan je project
   - Bevat alles wat je nodig hebt voor REST controllers en JSON handling
2. Klik op "Create"

### Project structuur
Na het aanmaken krijg je automatisch een projectstructuur met:
- `src/main/java/` - Hier komen je Java-klassen
- `src/main/resources/` - Hier komen configuratiebestanden
- `pom.xml` (Maven) of `build.gradle` (Gradle) - Build configuratie
- Een hoofdklasse met `@SpringBootApplication` annotatie

## 7. Opstarten van de applicatie

### Binnen IntelliJ IDEA
Open de Main-klasse (met `@SpringBootApplication`) en klik op de groene Run-knop. IntelliJ bouwt en start de app.

### Server draait
Zodra in de console "Started Application in … seconds" verschijnt, luistert de embedded server op poort 8080.

## 8. Aanroepen van de API-endpoints via Postman

Gebruik basis-URL `http://localhost:8080`.

- **GET /films**:
  GET → `/films`

- **GET /films/{id}**:
  GET → `/films/123`

- **POST /films**:
  POST → `/films`
  Body (raw JSON) met titel, beschrijving, genre en releasedatum.
  Logging: `System.out.println("New film: " + filmDto);`

- **GET /films/populair**:
  GET → `/films/populair?limit=5&datum=2025-06-10`

- **POST /films/{id}/rating**:
  POST → `/films/123/rating`
  Body (raw JSON) met userId, score en timestamp.
  Logging: `System.out.println("New rating: " + ratingDto);` 