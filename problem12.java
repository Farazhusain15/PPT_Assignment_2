import java.util.Scanner;

public class problem12 {
    public static boolean placeFlowers(int[] flowerbed,int k){
        int count=0;
        int n=flowerbed.length;
        int i=0;
        while (i<n){
            if (flowerbed[i]==0 &&(i==0)|| flowerbed[i-1]==0 &&(i==n-1)|| flowerbed[i+1]==0){
                flowerbed[i]=1;
                count++;
            if (count>=n){
                break;
            }
            }
            i++;

        }
        return count>=n;
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
        System.out.println("enter the value of k:");
        int k=sc.nextInt();
        boolean ans=placeFlowers(arr,k);
        System.out.println(ans);
    }
}
