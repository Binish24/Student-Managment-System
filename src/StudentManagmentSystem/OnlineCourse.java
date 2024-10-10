package StudentManagmentSystem;

public class OnlineCourse extends Course{
    private String platform;

    public OnlineCourse(String courseName, int courseId, String platform){
        super(courseName, courseId);
        this.platform = platform;
    }

    @Override
    public void displayCourseInfo(){
        System.out.println("Online Course: " + getCourseName() + ", ID: " + getCourseId() + ", Platform: "+ platform);
    }
}