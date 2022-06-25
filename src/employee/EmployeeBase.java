package employee;

import abstractClass.PersonAbstract;

public class EmployeeBase extends PersonAbstract {
    private double salary;
    private boolean accessToBudget;

    public EmployeeBase(String name, int age, double salary, boolean accessToBudget) {
        super.setName(name);
        super.setAge(age);
        this.salary = salary;
        this.accessToBudget = accessToBudget;
    }

    public boolean closingDoor() {
        return true;
    }
    public boolean openingDoor() {
        return true;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isAccesToBudget() {
        return accessToBudget;
    }

    public void setAccesToBudget(boolean accesToBudget) {
        this.accessToBudget = accesToBudget;
    }



}
