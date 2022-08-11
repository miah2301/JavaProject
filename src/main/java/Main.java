import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;


public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5,100);
        Food appleRed = new Apple(10, 50, "red");
        Food appleGreen = new Apple(8, 60, "green");

        Food [] foods = new Food[3];
        foods [0] = meat;
        foods [1] = appleRed;
        foods [2] = appleGreen;

        ShoppingCart shoppingCart = new ShoppingCart(foods);
        System.out.println("Общая сумма всех товаров: " + shoppingCart.getSumCart());
        System.out.println("Общая сумма скидки: " + shoppingCart.getTotalDiscount());
        System.out.println("Общая сумма веганских товаров " + shoppingCart.getSumVegan());
    }
}
