# Botory 
A simple reading log application built with Java and Spring Boot.

**Botory** is a personal reading log management system developed in Java.     
This application was created as a project for a university Java programming course and is designed to run exclusively in a local environment.

  
## Key Features
- **User Authentication**: Secure user registration and login functionality.
- **Book Search**: Search for books using the Kakao Book Search API.
- **Reading Log Management**: Write, save, and view your personal book reviews and reading records.
- **Dashboard**: View a complete list of your saved reading logs.

    **Note**: This application currently uses an **H2 in-memory** database. This means all data is temporary and will be cleared when the application stops. A future update is planned to integrate a persistent database (e.g., MySQL, PostgreSQL).

  
## Tech Stack
- **Backend**: Java 23, Spring Boot
- **Frontend**: HTML, Thymeleaf
- **Database**: H2 Database (In-memory)
- **API**: Kakao Book Search API
- **IDE**: IntelliJ IDEA  

  
## How to Run
This project is intended for **local execution only** and is not configured for deployment.  

  
### Prerequisites
- Java 23 (or your project's specific version)
- IntelliJ (or another IDE)
- A valid Kakao REST API Key


  
### Setup Instructions 
  
1. Clone the repository

    ``git clone https://github.com/cnamorose/Botory.git``
  
2. Navigate to the project directory 

    ``cd Botory``

3. Set your API Key in the Source Code:
    - Navigate to the file:

        ``src/main/java/com/botory/controller/BookSearchController.java``

    - Find the following line inside the search method:  

        ``headers.set("Authorization", "KakaoAK {your API}");``

4. Run the application using your IDE

  
## Future Improvements

Planned improvements for later versions include:

- **Database Migration**: Switching from the in-memory H2 database to a persistent one (e.g., MySQL or PostgreSQL) for permanent data storage.
- **Frontend Redesign**: Updating the UI for a cleaner and more modern look.
- **Cloud Deployment**: Making the project accessible as a live website through a cloud platform.
  
  
## License

This project was created for educational purposes. The source code is not licensed for commercial use.

It includes several open-source libraries and APIs, such as Spring Boot and the Kakao Book Search API.  
Please refer to the respective terms and licenses for those components.
