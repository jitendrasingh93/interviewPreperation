package spring.dipendency.injection.ci.inheritingbean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Created by JitendraSingh on 27/12/17.
 */
public class Main {

    public static void main(String[] args) {
        //Resource resource = new ClassPathResource("applicationContext.xml");
        //BeanFactory factory = new XmlBeanFactory(resource);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Employee employee = (Employee) factory.getBean("employee1");
        Employee employee = (Employee) context.getBean("employee1");
        employee.show();
    }
}
