import java.util.Scanner;

public class monotonic {
    public static boolean monotonic(int[] arr){
        boolean inc=true;
        boolean dec=true;
        for (int i=1;i<arr.length;i++){
            if (arr[i]<arr[i-1]){
                inc=false;
            }
            if (arr[i]>arr[i-1]){
                dec=false;
            }
        }
        return inc||dec;
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
        System.out.println(monotonic(arr));
    }
}
