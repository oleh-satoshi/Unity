package employee;

public class Director extends EmployeeBase {

    public Director(String name, int age, double salary) {
        super(name, age, salary, true);
    }

    public boolean toSign() {
        return false;
    }

    public boolean toApprove() {
        return false;
    }

    public boolean searchPersonnel() {
        return true;
    }

}
