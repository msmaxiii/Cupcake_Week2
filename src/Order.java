import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;


public class Order {

    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {
        System.out.println("Hello customer. Would you like to place an order ? (Y or N");

        Scanner input = new Scanner(System.in);
        String placeOrder = input.nextLine();

        int itemNumber = 0;

        ArrayList<Object> order = new ArrayList<Object>();
        if (placeOrder.equalsIgnoreCase("Y")) {
            order.add(LocalDate.now());
            order.add(LocalTime.now());

            System.out.println("Here is the menu.");
            System.out.println("CUPCAKES");
            for (int i = 0; i < cupcakeMenu.size(); i++) {
                itemNumber++;
                System.out.println(itemNumber + ".");
            }
        } else {
            System.out.println("Have a nice day then");
        }
        int i = 0;
        cupcakeMenu.get(i).type();
        System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());

        System.out.println();
        System.out.println("DRINKS");

        for (int i = 0; i < drinkMenu.size(); i++) {
            itemNumber++;
            System.out.println(itemNumber + ".");
        }
        drinkMenu.get(i).type();
        System.out.println("Price: $" + drinkMenu.get(i).getPrice());

        System.out.println();

        boolean ordering = true;
        while (ordering)
            System.out.println("What would you like to order? Please use the number associated with each item to order");
    }








}

