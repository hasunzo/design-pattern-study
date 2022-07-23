package chapter1.ActionAdventure;

public class MiniAdventureSimulator {
    public static void main(String[] args) {
        Character knight = new Knight();
        knight.fight();
        knight.attack();

        Character king = new King();
        king.fight();
        king.attack();

        Character queen = new Queen();
        queen.fight();
        queen.attack();

        Character troll = new Troll();
        troll.fight();
        troll.attack();
    }
}
