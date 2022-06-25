package employee;

public class Chaplain extends EmployeeBase {

    public Chaplain(String name, int age, double salary, boolean accessToBudget) {
        super(name, age, salary, accessToBudget);
    }

    public boolean saySpiritualPart() {
        return true;
    }

    public boolean participateInEvent() {
        return true;
    }

    public boolean sincereConversation() {
        return true;
    }

}
