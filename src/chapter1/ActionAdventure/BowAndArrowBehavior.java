package chapter1.ActionAdventure;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("화살이 날라가요~! ----->");
    }
}
