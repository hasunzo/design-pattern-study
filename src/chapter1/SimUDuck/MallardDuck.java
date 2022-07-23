package chapter1.SimUDuck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void swim() {
        System.out.println("헤엄");
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }

}
