1. Open Spring Tool Suite
2. Create a Maven project and make it Spring Boot Application or Create a Spring Starter project if possible
3. Make a POJO Class named 'Cars.java' with the annotation @Component and @Scope("prototype") with Setters Getters and toString() method.
4. For Spring JDBC if you are using MySQL Database then you need to define the database name, password and the url separately in the application.properties file which generally includes your configurations of that particular project
spring.datasource.username=root
spring.datasource.password=ebaad
spring.datasource.url=jdbc:mysql://localhost:3306/ebaad
