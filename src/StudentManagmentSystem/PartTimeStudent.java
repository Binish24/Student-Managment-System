package StudentManagmentSystem;

public class PartTimeStudent extends Student{
    private int hoursWorked;

    public PartTimeStudent(String name, int studentId, int hoursWorked){
        super(name, studentId);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void displayDetails(){
        System.out.println("Part-Time Student: " +getName() + ", ID" + getStudentId() + ", Hours Worked: " + hoursWorked);
    }
}
