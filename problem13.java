import java.util.Arrays;
import java.util.Scanner;

public class problem13 {
    public static int maxProduct(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        return Math.max(arr[n-1]*arr[n-2]*arr[n-3],arr[0]*arr[1]*arr[n-1]);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the Array elements:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=maxProduct(arr);
        System.out.println(ans);
    }
}
