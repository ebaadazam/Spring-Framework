1. Open Spring Tool Suite
2. Create a Maven Project with quickstart
3. Add 'Spring Context' and 'Spring Boot Starter Web' Dependencies in pom.xml file from the MVN Repository
4. Create a POJO class (bean) with the setters and getters for all data members and toString() method
5. The POJO we have created is Cars. Mark Cars class with @Component annotation which means when we use the annotation @Component then Spring Framework is responsible for creating the object of class Cars using getBeans(). @Component is a Spring annotation used to indicate that a Java class is a Spring component. Spring components are Java classes managed by the Spring IoC (Inversion of Control) container.
6. Open App.java file in src/main/java folder
7. Mark App.java class as @SpringBootApplication annotation that simplifies the configuration and setup of Spring applications, enabling you to quickly create and deploy applications with minimal configuration.
8. Now within main method, we will create the object of the ApplicatinContext to use the getBeans() method which will be used to retrieve/provide you the instance of a class/bean from the container
9. The run() method is a static method provided by the SpringApplication class. It is used to start a Spring Boot application and gives you the object of ApplicationContext.
10. ApplicationContext is an interface in Spring for providing configuration information to the application and managing the beans(objects)that make up the application. ApplicationContext will simply create a spring container for you inside JVM. In Spring Container you have beans(class with setters getters). So we have our objects inside this container and when user use getBeans() method it retrieves or provides an instance of a bean from the container. The getBeans() belongs to ApplicationContext() interface, so we need the object of it

@SpringBootApplication  
public class App {
    public static void main(String[] args) {
    
    	ApplicationContext context = SpringApplication.run(App.class, args);
        
    	Cars cars = context.getBean(Cars.class); // getBeans() provide you the object of the class
    	Cars cars2 = context.getBean(Cars.class); //bean is requested again so create new instance
    	
    	List<Cars> listOfCars = new ArrayList();
    	cars.setBrand("Audi");
    	cars.setModel("R8 V10 Spyder");
    	cars.setYear(2020);
    	cars2.setBrand("Merc");
    	cars2.setModel("Maybach S680");
    	cars2.setYear(2023);
    	
    	listOfCars.add(cars);
    	listOfCars.add(cars2);
    	
        for(Cars c : listOfCars) {
        	System.out.println(c);
        }
    }
}
