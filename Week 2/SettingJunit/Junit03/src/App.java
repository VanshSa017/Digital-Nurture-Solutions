public class App {
    public String reverse(String s){
        int l=0;
        int r=s.length()-1;
        char[] arr= s.toCharArray();

        while(l<r){
            char temp=arr[r];
            arr[r]=arr[l];
            arr[l]=temp;

            l++;
            r--;
        }

        return new String(arr);
    }
}
