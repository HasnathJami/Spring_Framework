package springFramework.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDriver {
    public static void main(String[] args) {
        System.out.println("Test");

//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml")); //it is deprecated
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        Person person1 = (Person) factory.getBean("person_b_id");
//        person1.age = 15;
        System.out.println(person1.age);
        person1.walk();

        Person person2 = (Person) factory.getBean("person_b_id");
        System.out.println(person2.age);

        //ApplicationContext factory = new ClassPathXmlApplicationContext();
    }
}
