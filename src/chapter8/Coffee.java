package chapter8;

// 커피를 만드는 Coffee 클래스
public class Coffee {
    void prepareRecipe() {
        // 커피 만드는 법
        // 각 단계는 별도의 메소드로 구현
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        System.out.println("설탕과 우유를 추가하는 중");
    }

    private void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    private void brewCoffeeGrinds() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    private void boilWater() {
        System.out.println("물 끓이는 중");
    }
}
