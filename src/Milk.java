
// participant: ConcreteDecorator

public class Milk extends CoffeeDecorator {
    public Milk (Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
 
    @Override
    public double getCost() {
        return super.getCost() + addedCost();
    }
     
    @Override
    public String getIngredients() {
        return super.getIngredients() + addedIngredient();
    }
    
    private double addedCost() {
        return 0.5;
    }

    
    private String addedIngredient() {
        return "+Milk";
    }
}
