package Algos;

import java.util.Arrays;
import Exception.PairNotFoundException;

public class PairSumSolver {

    public int[] pairSumNested(int[] arr, int target)throws PairNotFoundException{
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(target==arr[i]+arr[j]) return new int[]{arr[i],arr[j]};
            }
        }
        return new int[]{};
    }

    public int[] pairSum(int[] arr, int target){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;

        while(i<j){
            if(arr[i]+arr[j]==target) return new int[]{arr[i],arr[j]};
            else if (arr[i]+arr[j]<target) {
                i++;
            }else{
                j--;
            }
        }
        throw new PairNotFoundException("Pair Not found");
    }
}
