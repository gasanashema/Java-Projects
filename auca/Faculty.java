package auca;

public class Faculty extends GishushuCampus {

    private int facultyId;
    private String facultyName;

    public Faculty(int id, String gishushuAddress, String gishushuPhone, String gishushuEmail, int facultyId, String facultyName) {
        super(id, gishushuAddress, gishushuPhone, gishushuEmail);
        this.facultyId = facultyId;
        this.facultyName = facultyName;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        if (facultyId!=1) {
            System.out.println("invalid Id");
            return;
        }
        this.facultyId = facultyId;
    }

    public void setFacultyName(String facultyName) {
        if (!facultyName.equals("IM") || !facultyName.equals("SE") || !facultyName.equals("NT")) {
            System.out.println("Invalid faculty. it must be IM, SE or NT");
        }
        this.facultyName = facultyName;
    }

    public void getFacultyName() {
        System.out.println("Software Engineering");
    }
}
