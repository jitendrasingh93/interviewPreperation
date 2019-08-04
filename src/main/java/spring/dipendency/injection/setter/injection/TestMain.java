package spring.dipendency.injection.setter.injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by JitendraSingh on 27/12/17.
 */
public class TestMain {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Employee employee = (Employee) factory.getBean("emp");
        employee.show();
    }
}
