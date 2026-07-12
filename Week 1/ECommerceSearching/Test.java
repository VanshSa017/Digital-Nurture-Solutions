public class Test {
    public static void main(String[] args){
        Product[] products = {

            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Headphones", "Accessories"),
            new Product(104, "Keyboard", "Accessories"),
            new Product(105, "Mouse", "Accessories")

        };

        int targetId = 104;

        System.out.println("Linear Search Result:");

        Product ans =
                LinearSearch.search(products, targetId);

        if (ans)
            System.out.println("Product Found!");
        else
            System.out.println("Product not found");

        System.out.println("\nBinary Search Result:");

        Product binaryResult =
                BinarySearch.search(products, targetId);

        if (binaryResult)
            System.out.println("Product Found!");
        else
            System.out.println("Product not found");
    }
}
    
