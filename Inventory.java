import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products = new ArrayList<>();

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
   
    public Product findProductById(int id) {
        for (Product p : products) {
            if (id == p.getId()) {
                return p;
            }
        }
        return null; // Fixed: added semicolon
    }
}
