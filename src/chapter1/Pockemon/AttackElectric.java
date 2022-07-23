package chapter1.Pockemon;

public class AttackElectric implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("전기공격 !!");
    }
}
