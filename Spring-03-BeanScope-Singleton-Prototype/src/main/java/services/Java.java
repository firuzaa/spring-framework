package services;


import interfaces.Course;
import lombok.Data;

@Data
public class Java implements Course {

    public void getTeachingHours() {
        System.out.println("Weekly Teaching java hours: 20" );
    }
}
