package model;

public abstract class Food implements Discountable{
    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean getIsVegetarian() {
        return isVegetarian;
    }

    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    @Override
    public double getDiscount(){
        return 0;
    }



}
