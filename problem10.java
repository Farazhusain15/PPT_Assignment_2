import java.util.Arrays;
import java.util.Scanner;

public class problem10 {
    public static int distributeCandy(int[] candy){
        int n=candy.length;
            if (n==0){
                return 0;
            }
            int type=0;
            Arrays.sort(candy);
            for (int i=1;i<n;i++){
                if (candy[i]!=candy[i-1]){
                    type++;
                }
            }
            return Math.min(type,n/2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Size of an Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the Array Elements:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=distributeCandy(arr);
        System.out.println(ans);
    }
}
