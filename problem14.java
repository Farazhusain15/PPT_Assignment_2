import java.util.Scanner;

public class problem14 {
    public static  int FindIdx(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while (low<high){
            int mid=low+(high-low)/2;
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the Array element:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target number:");
        int k=sc.nextInt();
        int ans=FindIdx(arr,k);
        System.out.println(ans);
    }
}
