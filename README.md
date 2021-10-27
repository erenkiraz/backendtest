# backendtest

 How To Build And Run The Application
I use Intellij IDEA for building project and Postman for testing the result
1. Click Open or Import at IntelliJ welcome page.
2. Chose pom.xml and Open as Project
3. Run mvn spring-boot:run at Run anything screen.
4. Finally, we can check the result with the postman
http://localhost:8080/routing/CZE/ITA   success ( 200 )
{
    "route": [
        "CZE",
        "AUT",
        "ITA"
    ]
}

http://localhost:8080/routing/CZE/ARG.  fail ( 400 )

Route not found
  
