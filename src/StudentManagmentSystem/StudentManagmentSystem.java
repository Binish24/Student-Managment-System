package StudentManagmentSystem;

import java.util.*;
public class StudentManagementSystem {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<Enrollment> enrollments = new ArrayList<>();


    public void addStudent(Student student){
        students.add(student);
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void enrollStudent(Student student, Course course){
        Enrollment enrollment = new Enrollment(student, course);
        enrollments.add(enrollment);
    }

    public void displayAllEnrollments(){
        for(Enrollment enrollment: enrollments){
            enrollment.displayEnrollmentInfo();
            System.out.println();
        }
    }

    public static void main(String[] args){
        StudentManagementSystem sms = new StudentManagementSystem();


        //Adding students
        RegularStudent student1 = new RegularStudent("Alice", 1, "Computer Science");
        PartTimeStudent student2 = new PartTimeStudent("Bob",2,20);
        PartTimeStudent student3 = new PartTimeStudent("jacy",3,30);
        sms.addStudent(student1);
        sms.addStudent(student2);
        sms.addStudent(student3);

        //Adding courses
        OnlineCourse course1 = new OnlineCourse("Java programming", 101,"Udemy");
        InPersonCourse course2 = new InPersonCourse("Data Structures",102,"Room 10");
        sms.addCourse(course1);
        sms.addCourse(course2);



        //Enrolling students in courses
        sms.enrollStudent(student1, course1);
        sms.enrollStudent(student2, course2);
        sms.enrollStudent(student3,course1);

        //Display all enrollments
        sms.displayAllEnrollments();



    }

}
