package model;

public class Meat extends Food implements Discountable{
    public Meat(int amount, double price) {
        isVegetarian = false;
        this.amount = amount;
        this.price = price;
    }

}

