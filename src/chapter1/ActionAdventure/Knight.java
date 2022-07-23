package chapter1.ActionAdventure;

public class Knight extends Character {

    public Knight() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("knight fight!");
    }
}
