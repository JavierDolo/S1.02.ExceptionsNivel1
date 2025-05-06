
import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addProduct(Product newProduct) {
        products.add(newProduct);
    }


    public void calculateTotalPrice() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException("To make a sale you must first add products.");
        }
        totalPrice = products.stream().mapToDouble(Product::getPrice).sum();
        System.out.println("Total sale price: " + totalPrice + " €");
    }

    public List<Product> getProducts() {
        return products;
    }
}
