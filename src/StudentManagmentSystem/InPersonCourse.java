package StudentManagmentSystem;

public class InPersonCourse extends Course {
    private String location;

    public InPersonCourse(String courseName, int courseId, String location){
        super(courseName, courseId);
        this.location = location;
    }

    @Override
    public void displayCourseInfo(){
        System.out.println("In-Person Course: "+ getCourseName() + ", ID: " + getCourseId() + ", Location: " + location);

    }

}