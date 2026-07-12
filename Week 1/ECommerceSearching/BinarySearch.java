import java.util.Arrays;

public class BinarySearch {

    private static boolean binarySearch(Product[] p, int target) {

        int l = 0;
        int r = p.length - 1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (p[mid].getProductId() == target) {
                return true;
            }

            if (p[mid].getProductId() < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;
    }

    public static boolean search(Product[] p, int target) {

        Arrays.sort(p,
                (a, b) -> Integer.compare(a.getProductId(),
                                          b.getProductId()));

        return binarySearch(p, target);
    }
}