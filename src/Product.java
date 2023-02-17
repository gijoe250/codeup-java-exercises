public class Product {
    /* TODO: create a class called Product with two private properties of name and priceInCents.
    Add a public static method called, find average price that takes in an array of products
    and finds the average price of all products. Add a main method to the class to test some
    values.
 */
    private String name;
    private int priceInCents;

    public static double findAveragePrice(Product[] products){
        double sum = 0;
        for (Product product : products){
            sum += product.priceInCents;
        }
        return sum/products.length;
    }

    public Product(String name, int priceInCents) {
        this.name = name;
        this.priceInCents = priceInCents;
    }

    public static void main(String[] args){
        Product[] products = new Product[3];
        products[0] = new Product("one", 1);
        products[1] = new Product("two", 5);
        products[2] = new Product("three", 9);

        System.out.println(Product.findAveragePrice(products));
    }
}
