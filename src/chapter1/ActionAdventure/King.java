package chapter1.ActionAdventure;

public class King extends Character {
    public King() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.println("King fight!!");
    }
}
