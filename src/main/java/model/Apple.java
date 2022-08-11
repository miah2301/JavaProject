package model;

import static model.constans.Colour.colourRed;
import static model.constans.Discount.discountAppleRed;

public class Apple extends Food implements Discountable{
    String colour;

    public Apple(int amount, double price, String colour) {
        isVegetarian = true;
        this.amount = amount;
        this.price = price;
        this.colour = colour;

    }

    @Override
    public double getDiscount() {
        if (colour.equals(colourRed)) {
            return discountAppleRed;
        }
        else {
            return 0;
        }
    }
}


