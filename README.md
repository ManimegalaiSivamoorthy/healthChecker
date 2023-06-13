# Health Checker

This is a library that reads the endpoints exposed from the App and shows the current status of the endpoints in a webpage. 

The webpage is published using ThymeLeaf.

**Webpage**: http://localhost:8080/endpoints_status

**Build Process**: 
1) Clone this Repo
2) Build the repo using `./gradlew clean build` command in the terminal window (Or Similar command in Windows)
3) The jar could be found under build/libs directory

**Usage**:  
1) Just include this jar as a dependency to the other spring boot application
2) Make sure the consuming app performs `ComponentScan` 
    Eg: `@ComponentScan("com.velayudham")` or `@ComponentScan({"com.velayudham", "com.consuming.application"})` 
3) Run the consuming app and Hit the URL http://localhost:8080/endpoints_status to see the statuses of the endpoint

**Note:** 
This library is intended to be used only with Spring Boot Applications Only and won't work with Apps that uses other frameworks. 


