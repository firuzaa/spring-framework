package services;

import interfaces.Course;

public class Java implements Course {

    public void getTeachingHours() {
        System.out.println("Weekly Teaching java hours: 20" );
    }

    public void muInitMethod(){
        System.out.println("Executing init method");
    }

    public void myDestroyMethod(){
        System.out.println("Executing destroy method");
    }
}
