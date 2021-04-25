public class Main {

    public static void main(String[] args) {
        // product1
        Product product1 = new Product();
        product1.id = 1;
        product1.name = "Lenovo V14";
        product1.unitPrice = 15000;
        product1.detail = "16 GB RAM";

        // product 2
        Product product2 = new Product();
        product2.id = 2;
        product2.name = "Lenovo V15";
        product2.unitPrice = 16000;
        product2.detail = "32 GB RAM";

        // product 3
        Product product3 = new Product();
        product3.id = 3;
        product3.name = "HP 5";
        product3.unitPrice = 10000;
        product3.detail = "8 GB RAM";

        Product[] products = {product1, product2, product3};

        for (Product product: products) {
            System.out.println(product.name);
        }

        System.out.println(products.length);
    }
}
