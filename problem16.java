import java.util.Arrays;

public class problem16 {
    public static int minscore(int[] arr,int k){
        int n=arr.length;
        Arrays.sort(arr);
        int minval=arr[0];
        int maxval=arr[n-1];
        if (k==0){
            return maxval-minval;
        }
        int minscore=maxval-maxval;
        for (int i=0;i<n;i++){
            int low=arr[i]+k;
            int high=arr[i+1]-k;
            minval=Math.min(low,arr[0]+k);
            maxval=Math.max(high,arr[n-1]-k);
            minscore=Math.min(minscore,maxval-minval);
        }
        return minscore;
    }
    public static void main(String[] args) {
        int[] arr={1};
        int k=0;
        int result=minscore(arr,k);
        System.out.println(result);
    }
}
