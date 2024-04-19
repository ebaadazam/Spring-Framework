1. Open Spring Tool Suite
2. Create a Maven project and make it Spring Boot Application or Create a Spring Starter project if possible
3. Make a POJO Class named 'Cars.java' with the annotation @Component and @Scope("prototype") with Setters Getters and toString() method.
4. For Spring JDBC if you are using MySQL Database then you need to define the database name, password and the url separately in the application.properties file which generally includes your configurations of that particular project
spring.datasource.username=root
spring.datasource.password=ebaad
spring.datasource.url=jdbc:mysql://localhost:3306/ebaad
5. Add the dependencies in the pom.xml file required for Spring JDBC.
6.  Now we create another java file named 'CarRepository' for communicating with the database as we cant define all the operations and the logic for the database connectivity in the main java spring file. For that we need to have a separate file which will be responsible for communicating with the database.
7.  In CarRepository, we will make object of the 'JdbcTemplate' which is a central class providing a template method API for JDBC Operations, eliminating the need for manually handling the JDBC 7 steps for connection establishment and query execution. Generate its setters and getters which will be of type JdbcTemplate.
8.  In CarRepository, there will be two methods defined in it. One is "public void save(takes the obj of POJO class)" and another method is "public List<Car> findAll()" which will return the list type.
9.  In public void save() method, you will write the sql query in the form of prepared statement like with the question marks for the values such as
String sql = "insert into car (modelNo, modelName) values(?,?)";
