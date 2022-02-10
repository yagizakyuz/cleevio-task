# Spring Boilerplate

This is a backend project which developed with ❤️ using Spring Boot, Hibernate and PostgreSQL.

The application runs on port ```9090``` but it can be changed by modifying ```application.properties```

It has 2 endpoints which accepts and returns either xml or json according to request headers.

Simply add ```Accept: application/json``` or ```Accept: application/xml``` for response and ```Content-Type: application/xml``` or ```Content-Type: application/json``` for the request.

## How To Run

You need to install:
- [Jdk 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven 3.8.4](https://maven.apache.org/download.cgi)
- Add ```JAVA_HOME``` and ```MAVEN_HOME``` to environment variables.

Then you can use ```mvn spring-boot:run``` command to run the application.


## Endpoints

### GET /watches 

Request -> Does not take any inputs 

Response -> Returns the watches from the database
```
[
  {
    "id": 1,
    "title": "Prim",
    "price": 250000,
    "description": "A watch with a water fountain picture",
    "fountain": "R0lGODlhAQABAIAAAAUEBA",
    "transactionDate": "2022-01-28T08:05:55.856+00:00"
  }
]
```

### POST /watches ->

Request ->
```
  {
    "title": "Prim",
    "price": 250000,
    "description": "A watch with a water fountain picture",
    "fountain": "R0lGODlhAQABAIAAAAUEBA",
    "transactionDate": "2022-01-28T08:05:55.856+00:00"
  }
```

Response -> 
```
  {
    "id": "1"
  }
```
