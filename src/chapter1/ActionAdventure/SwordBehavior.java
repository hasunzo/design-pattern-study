package chapter1.ActionAdventure;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("검을 휘두르는 소리 주황");
    }
}
