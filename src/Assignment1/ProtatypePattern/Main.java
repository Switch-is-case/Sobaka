package Assignment1.ProtatypePattern;

public class Main {
    public static void main(String[] args) {
        Product originalProduct = new Product("Iphone 13", 1200.00);

        Product clonedProduct = (Product) originalProduct.clone();

        clonedProduct.setPrice(900.00);

        System.out.println("Original Product: " + originalProduct);
        System.out.println("Cloned Product: " + clonedProduct);
    }
}
