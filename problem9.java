import java.util.Arrays;
import java.util.Scanner;

public class problem9 {
    public static int Pairmin(int[] arr){
        Arrays.sort(arr);
        int sum=0;
        int n=arr.length;
        for (int i=0;i<n;i=i+2){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the Array Elements:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=Pairmin(arr);
        System.out.println(ans);
    }
}
