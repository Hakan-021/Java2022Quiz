public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Leptop","Asus Leptop", 300,2,"Siyah");


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());

    }
}