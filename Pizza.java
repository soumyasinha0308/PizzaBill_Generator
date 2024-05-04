package com.github;

public class Pizza {
    private int price;
    private boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int carrybagPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isOptedforTakeaway=false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice=this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded=true;
        //if cheese added increase price by 100
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded=true;
        this.price += extraToppingsPrice;
    }

    public void takeAway() {
        isOptedforTakeaway=true;

        this.price += carrybagPrice;
    }

    public void getBill() {
        String bill="";
        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+="extra cheese added: " +extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded){
            bill+="extra toppings added: " +extraToppingsPrice+ "\n";
        }
        if(isOptedforTakeaway){
            bill+="carry bag required: " + carrybagPrice+ "\n";
        }
        bill+="Bill: "+this.price +"\n";
        System.out.println(bill);
    }

}
/*
base pizza: 300
toppings: 150
cheese: 100
take away:20
 */


