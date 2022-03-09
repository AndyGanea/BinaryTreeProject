public class StudentInfo {
    
    // Attributes
    public int studentNum;
    public String firstName;
    public String lastName;
    public StudentInfo left;
    public StudentInfo right;

    // Constructor Declaration of Class
    public StudentInfo () {
        studentNum = 917387;
        firstName = "Andy";
        lastName = "Ganea";
    }
    public StudentInfo(int studentNum, String firstName, String lastName) {
        this.studentNum = studentNum;
        this.firstName = firstName;
        this.lastName = lastName;
        left = null; // Don't point to another student
        right = null;
    }

    public int getStudentNumber() {
        return studentNum;
    }

    public void setStudentNumber(int studentNum) {
        if (studentNum >= 0) {
            this.studentNum = studentNum;
        } else {
            this.studentNum = 0;
            System.out.println("Student number is not allowed to be negative.");
        }
           
    }
}
