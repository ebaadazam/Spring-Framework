1. Open Spring Tool Suite
2. Create a simple Maven Project with quickstart
3. Add 'Spring Context' and 'Spring Boot Starter Web' Dependencies in pom.xml file from the MVN Repository
4. Create a POJO class (bean) with the setters and getters for all data members and toString() method
5. Open App.java file in src/main/java folder
6. Now within main method, we will create the object of the ApplicatinContext to use the getBeans() method which will be used to retrieve/provide you the instance of a class/bean from the container
7. ApplicationContext is an interface in Spring for providing configuration information to the application and managing the beans(objects)that make up the application. ApplicationContext will simply create a spring container for you inside JVM. In Spring Container you have beans(class with setters getters). So we have our objects inside this container and when user use getBeans() method it retrieves or provides an instance of a bean from the container. The getBeans() belongs to ApplicationContext() interface, so we need the object of ApplicationContext to use getbeans() method
8. So, ApplicationContext creates an object for you and that object is stored inside the Spring Container whether you want it or not and getBeans() is used to retreive that object and provide it to the user
