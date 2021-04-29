public class Main {

    public static void main(String[] args) {

        Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB RAM", 10, 13500);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Lenovo V15");
        product2.setDetail("16 GB RAM");
        product2.setDiscount(10);
        product2.setUnitPrice(16000);

        System.out.println(product2.getUnitPriceAfterDiscount());
        System.out.println("-----------------------------------------------------");

        Product product3 = new Product();

        Product[] products = {product1, product2, product3};

        for (Product product: products) {
            System.out.println(product.getName());
        }
        System.out.println("-----------------------------------------------------");
        System.out.println(products.length);
        System.out.println("-----------------------------------------------------");

        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Drink");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Food");

        System.out.println(category1.getName());
        System.out.println("-----------------------------------------------------");

        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);
    }
}
