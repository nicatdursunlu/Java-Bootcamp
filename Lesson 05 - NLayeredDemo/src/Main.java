import business.abstracts.ProductService;
import business.concretes.ProductManager;
import dataAccess.concretes.AbcProductDao;
import entities.concretes.Product;


public class Main {

    public static void main(String[] args) {

        ProductService productService = new ProductManager(new AbcProductDao());

        Product product = new Product(1, 2, "Apple", 12, 50);
        productService.add(product);

    }
}
