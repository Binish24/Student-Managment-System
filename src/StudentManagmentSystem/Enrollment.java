package StudentManagmentSystem;

public class Enrollment {
        private Student student;
        private Course course;

        public Enrollment(Student student, Course course){
            this.student = student;
            this.course = course;
        }

        public void displayEnrollmentInfo(){
            student.displayDetails();
            course.displayCourseInfo();
        }


}
