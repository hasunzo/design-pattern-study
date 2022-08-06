package chapter3;

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    Pizza orderPizza(String type) {
        Pizza pizza = null;

        pizza = factory.createPizza(type);

        pizza.prepate();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}