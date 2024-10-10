package StudentManagmentSystem;

class RegularStudent extends Student {
    private String major;

    public RegularStudent(String name, int studentId, String major){
        super(name, studentId);
        this.major = major;
    }

    @Override
    public void displayDetails(){
        System.out.println("Regular Student: "+ getName() + ", ID: " + getStudentId() + ", Major: " + major);
    }
}
