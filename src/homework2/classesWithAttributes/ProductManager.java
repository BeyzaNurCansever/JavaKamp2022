package homework2.classesWithAttributes;

public class ProductManager {
    public void add(Product product) {
        //JDBC kodları ile veri tabanına kaydedilecek.
        //MySql,PostgreSql,MSSql
        System.out.println("Ürün Eklendi " + product.getName());
        System.out.println("Eklenen Ürün Kodu : " + product.getCode());
    }
}
