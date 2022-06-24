package managers;

public class Employee extends PersonAbstract {
    private double salary;
    private boolean accessToBudget;

    public Employee(String name, int age, double salary, boolean accessToBudget) {
        super.name = name;
        super.age = age;
        this.salary = salary;
        this.accessToBudget = accessToBudget;
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
