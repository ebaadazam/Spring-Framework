Open Spring Tool Suite
Create a Maven Project with quickstart
Add 'Spring Context' and 'Spring Boot Starter Web' Dependencies in pom.xml file from the MVN Repository
Create a two POJO classes (beans) with the setters and getters for all data members and toString() method
The POJO we have created is Cars. Mark Cars class with @Component annotation which means when we use the annotation @Component then Spring Framework is responsible for creating the object of class Cars using getBeans(). @Component is a Spring annotation used to indicate that a Java class is a Spring component. Spring components are Java classes managed by the Spring IoC (Inversion of Control) container.
Another POJO you create will be Mercedes and also mark it as @Component.
Open App.java file in src/main/java folder
Mark App.java class as @SpringBootApplication annotation that simplifies the configuration and setup of Spring applications, enabling you to quickly create and deploy applications with minimal configuration.
Now within main method, we will create the object of the ApplicatinContext to use the getBeans() method which will be used to retrieve/provide you the instance of a class/bean from the container
The run() method is a static method provided by the SpringApplication class. It is used to start a Spring Boot application and gives you the object of ApplicationContext.
ApplicationContext is an interface in Spring for providing configuration information to the application and managing the beans(objects)that make up the application. ApplicationContext will simply create a spring container for you inside JVM. In Spring Container you have beans(class with setters getters). So we have our objects inside this container and when user use getBeans() method it retrieves or provides an instance of a bean from the container. The getBeans() belongs to ApplicationContext() interface, so we need the object of it
