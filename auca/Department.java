package auca;

public class Department extends Faculty{
    // if department inherit from faculty the department is a subclass of faculty
    // therefore department will have full access to the properties and methods of faculty
    // in java multipe inheritance is not supported
    // if we want to inherit from more than one class we have to use interfaces
    public void getFacultyName() {
        System.out.println("Software Engineering");
    }
}
