1. Open Spring Tool Suite
2. Create a Maven Project with quickstart
3. Add 'Spring Context' and 'Spring Boot Starter Web' Dependencies in pom.xml file from the MVN Repository
4. Create a two POJO classes (beans) which are Cars and Mercedes and mark both with @Component annotation
5. Classes mark with @Component annotation means when we use the annotation @Component then Spring Framework is responsible for creating the object of class Cars using getBeans(). @Component is a Spring annotation used to indicate that a Java class is a Spring component. Spring components are Java classes managed by the Spring IoC (Inversion of Control) container.
6. Provide some method(s) in both the classes(Cars and Mercedes) to working purpose
7. Now in Cars class, we will create an instance of the Mercedes class with an annotation named @Autowired
8. @Autowired Annotation in Spring tells Spring to automatically provide the necessary objects(dependencies) when an instance of a class has been created such as "Mercedes merc" where merc is an instance which is not initialized but Spring will be responsible to initialize it. 
9. Open App.java file in src/main/java folder
10. Mark App.java class as @SpringBootApplication annotation that simplifies the configuration and setup of Spring applications, enabling you to quickly create and deploy applications with minimal configuration.
11. Now within main method, we will create the object of the ApplicatinContext to use the getBeans() method which will be used to retrieve/provide you the instance of a class/bean from the container
12. The run() method is a static method provided by the SpringApplication class. It is used to start a Spring Boot application and gives you the object of ApplicationContext.
13. ApplicationContext is an interface in Spring for providing configuration information to the application and managing the beans(objects)that make up the application. ApplicationContext will simply create a spring container for you inside JVM. In Spring Container you have beans(class with setters getters). So we have our objects inside this container and when user use getBeans() method it retrieves or provides an instance of a bean from the container. The getBeans() belongs to ApplicationContext() interface, so we need the object of ApplicationContext to use getBeans() method
14. So, ApplicationContext creates an object for you and that object is stored inside the Spring Container whether you want it or not and getBeans() is used to retreive that object and provide it to the user






