package spring.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import spring.dipendency.injection.CIWithMap;
import spring.dipendency.injection.Question;
import spring.dipendency.injection.Student;


/**
 * Created by JitendraSingh on 18/12/17.
 */
public class TestSpringMain {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Student student = (Student) beanFactory.getBean("studentbean");
        Question question = (Question) beanFactory.getBean("question");
        CIWithMap ciWithMap = (CIWithMap) beanFactory.getBean("ciwithmap");
        Question question1 = (Question) beanFactory.getBean("question1");

        System.out.println("\n CI injection : \n");
        student.displayInfo();
        System.out.println("\n (CI) Constructor injection with list : \n");
        question.displayData();
        System.out.println("\n CI with map : \n");
        ciWithMap.display();

        System.out.println("\n map with multiple object : \n");
        question1.mapDisplay();
    }
}
