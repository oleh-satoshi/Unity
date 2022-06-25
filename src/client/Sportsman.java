package client;

import abstractClass.PersonAbstract;

public class Sportsman extends ClientBase {

    private int skill;

    public Sportsman(String name, int age) {
        super.setName(name);
        super.setAge(age);
    }

    public void train() {

    }

    public boolean learnTechnique() {
        return true;
    }

    public boolean competeInCompetitions() {
        return true;
    }

    public boolean getIll() {
        return true;
    }

    public boolean leaveClub() {
        return false;
    }
}
