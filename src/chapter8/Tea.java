package chapter8;

public class Tea {
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    // Coffee 클래스와 중복
    private void boilWater() {
        System.out.println("물 끓이는 중");
    }

    // 홍차 전용 메소드
    private void steepTeaBag() {
        System.out.println("찻잎을 우려내는 중");
    }

    // 홍차 전용 메소드
    private void addLemon() {
        System.out.println("레몬을 추가하는 중");
    }

    // Coffee 클래스와 중복
    private void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
