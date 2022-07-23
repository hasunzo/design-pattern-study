package chapter1.SimUDuck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다");
    }

    @Override
    public void swim() {
        System.out.println("헤엄");
    }
}
