import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class problem11 {
    public static ArrayList<Integer> harmonious(int[] arr){
        int n=arr.length;
        ArrayList<Integer> result=new ArrayList<>();
        for (int i=1;i<n;i++){
            if (arr[i]==arr[i-1]-1 && arr[i]==arr[i-1]+1){
                result.add(arr[i]);
            }
            else {
                result.remove(arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the Array elements:");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans=harmonious(arr);
        System.out.println(ans.toString());
    }
}
