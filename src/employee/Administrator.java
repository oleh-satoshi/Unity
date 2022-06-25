package employee;



public class Administrator extends EmployeeBase {

    public Administrator(String name, int age, double salary) {
        super(name, age, salary, true);
    }

    public boolean SellCard() {
        return false;
    }

    public boolean RegisterForTraining() {
        return false;
    }

    public boolean recordOfVisits() {
        return false;
    }

    public boolean collectCommand() {
        return false;
    }
    public boolean paySalary() {
        return false;
    }

    public int SummarizeMonth() {
        return 0;
    }
}
