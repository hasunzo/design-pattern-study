package chapter3;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sause createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
