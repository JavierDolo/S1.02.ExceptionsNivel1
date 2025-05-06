import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();

        try {
            sale.calculateTotalPrice();
        }catch (EmptySaleException e) {
            System.out.println("Exception captured: " + e.getMessage());
        }

        sale.addProduct(new Product("Book", 14.90));
        sale.addProduct(new Product("Pen", 1.50));

        try{
            sale.calculateTotalPrice();
        }catch (EmptySaleException e) {
            System.out.println("Exception captured: " + e.getMessage());
        }

       // Test to force the "IndexOutOfBoundsException" exception
        try{
            System.out.println(sale.getProducts().get(5));
        }catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException captured: " + e.getMessage());
        }


    }
}
