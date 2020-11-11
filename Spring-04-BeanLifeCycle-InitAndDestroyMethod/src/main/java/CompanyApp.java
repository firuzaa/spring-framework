import interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Course javaCourse = container.getBean("javaCourse", Course.class);
        javaCourse.getTeachingHours();

        ((ClassPathXmlApplicationContext)container).close();

    }
}
