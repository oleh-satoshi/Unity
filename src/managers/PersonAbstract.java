package managers;

import Interface.PersonInterface;

public abstract class PersonAbstract implements PersonInterface {

    String name;
    int age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
