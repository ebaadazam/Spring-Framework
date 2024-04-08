/*
 * XmlBeanFactory has been removed in the later versions of Spring, you should replace the usage of 
 * XmlBeanFactory with an alternative i.e ApplicationContext. As I mentioned before, for 
 * modern Spring applications, it's recommended to use ApplicationContext implementations like 
 * ClassPathXmlApplicationContext or FileSystemXmlApplicationContext for loading bean definitions from
 *  an XML file.
 */

package com.ebaad.SpringBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // If the error says class not found then place the spring.xml file into the class path i.e within src/main/java folder
        
        Cars cars = (Cars) context.getBean("carz"); // Spring do not know this "carz" so we have to do some
        // configuration which can be done in XML based configuration, java based configuration or annotations
        // so create an XML configuration file named spring.xml
        
        cars.drive();
    }
}
