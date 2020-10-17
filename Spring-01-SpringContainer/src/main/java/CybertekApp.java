import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CybertekApp {
    public static void main(String[] args) {

        BeanFactory container = new ClassPathXmlApplicationContext("config.xml");

        Mentor mentor = (Mentor)container.getBean("partTimeMentor");
        //Mentor mentor1 = (Mentor)container.getBean("fullTimeMentor");
        Mentor mentor1 = container.getBean("fullTimeMentor", Mentor.class);

        mentor.createAccount();
        mentor1.createAccount();
    }
}
