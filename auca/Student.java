package auca;

public class Student extends Department{
    private String studentName;
    private int studentId;
    private String studentAddress;
    private String studentPhone;
    private String studentEmail;
    private String major;

    public Student() {
        super(0, "", "", "", 0, "", 0, "");
        this.studentName = "";
        this.studentId = 0;
        this.studentAddress = "";
        this.studentPhone = "";
        this.studentEmail = "";
        this.major = "";
    }

    public Student(int id, String gishushuAddress, String gishushuPhone, String gishushuEmail, int facultyId, String facultyName, int deptId, String deptName, String studentName, int studentId, String studentAddress, String studentPhone, String studentEmail, String major) {
        super(id, gishushuAddress, gishushuPhone, gishushuEmail, facultyId, facultyName, deptId, deptName);
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentAddress = studentAddress;
        this.studentPhone = studentPhone;
        this.studentEmail = studentEmail;
        this.major = major;
    }
    //getters and setters
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentAddress() {
        return studentAddress;
    }
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
    public String getStudentPhone() {
        return studentPhone;
    }
    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }
    public String getStudentEmail() {
        return studentEmail;
    }
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
}
