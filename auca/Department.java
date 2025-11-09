package auca;

public class Department extends Faculty{
    // if department inherit from faculty the department is a subclass of faculty
    // therefore department will have full access to the properties and methods of faculty
    // in java multipe inheritance is not supported
    // if we want to inherit from more than one class we have to use interfaces
    // method overriding: when one method can be found in more than one classes
    // we do override when we want to modify a method.
    // we use @Override

    private int deptId;
    private String deptName;
    public Department(int id, String gishushuAddress, String gishushuPhone, String gishushuEmail, int facultyId, String facultyName, int deptId, String deptName) {
        super(id, gishushuAddress, gishushuPhone, gishushuEmail, facultyId, facultyName);
        this.deptId = deptId;
        this.deptName = deptName;
    }
    public int getDeptId() {
        return deptId;
    }
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    
}
