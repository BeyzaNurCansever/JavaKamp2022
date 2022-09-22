package homework2.classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Notebook", "Monster Notebook", 30000, 10, "Silver");

        Product product1 = new Product();
        product1.setName("Desktop");
        product1.setId(2);
        product1.setDescription("Asus Desktop");
        product1.setPrice(10000);
        product1.setStockAmount(20);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        productManager.add(product1);

    }
}
