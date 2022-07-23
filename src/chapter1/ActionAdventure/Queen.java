package chapter1.ActionAdventure;

public class Queen extends Character {

    public Queen() {
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Queen fight!!");
    }
}
