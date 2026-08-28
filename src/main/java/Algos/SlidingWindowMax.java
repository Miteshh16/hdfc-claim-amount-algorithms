package Algos;

public class SlidingWindowMax {

    public void getMax(int[] arr,int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        for(int i=k, j=0;i< arr.length;i++){
            sum+=arr[i]-arr[j];
            j++;
            System.out.println(sum);
        }
    }
}
