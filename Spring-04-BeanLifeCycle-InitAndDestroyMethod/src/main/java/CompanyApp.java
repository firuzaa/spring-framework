import interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Course javaCourse = container.getBean("javaCourse", Course.class);
        Course javaCourse2 = container.getBean("javaCourse", Course.class);

        System.out.println("Pointing to the same object: " + (javaCourse == javaCourse2));
        System.out.println("Memory Location for the Course1 : " + javaCourse);
        System.out.println("Memory Location for the Course2 : " + javaCourse2);


    }
}
