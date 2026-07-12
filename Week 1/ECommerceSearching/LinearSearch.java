public class LinearSearch {
    public static boolean search(Product[] arr, int target) {
        for(Product p: arr){
            if(p.productId==target) return true;
        }
        return false;
    }
}
