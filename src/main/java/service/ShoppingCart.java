package service;

import model.Food;
public class ShoppingCart extends Food{

    private final Food[] foods;

    public double getSumCart(){
        double sum = 0;
        for (Food food : foods) {
            sum = sum + (food.getAmount() * food.getPrice());
        }
        return sum;
    }

    public double getTotalDiscount(){
        double sumTotalDiscount = 0;
        for (Food food : foods) {
            sumTotalDiscount = sumTotalDiscount + ((food.getAmount() * food.getPrice()) - (food.getAmount() * food.getPrice() * (food.getDiscount() / 100)));
        }
        return sumTotalDiscount;
    }

    public double getSumVegan(){
        double sumTotalVegan = 0;
        for (Food food : foods) {
            if (food.getIsVegetarian())
                sumTotalVegan = sumTotalVegan + (food.getAmount() * food.getPrice()) - (food.getAmount() * food.getPrice() * (food.getDiscount() / 100));
        }
        return sumTotalVegan;
    }


    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

}
