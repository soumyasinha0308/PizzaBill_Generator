package com.github;

public class DeluxPizza extends Pizza {
    public DeluxPizza(boolean veg){
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() { //removed super call // these are empty metods

    }

    @Override
    public void addExtraToppings() {

    }
}
