package chapter1.Pockemon;

public class AttackWater implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("물 공격~");
    }
}
