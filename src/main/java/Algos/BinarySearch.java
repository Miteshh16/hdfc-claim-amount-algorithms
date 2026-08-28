package Algos;

import java.util.Arrays;

public class BinarySearch {

    public void findAmount(int amount,int[] arr){
        Arrays.sort(arr);
        int i=0;
        int j= arr.length-1;

        while (i<=j){
            int mid=i+((j-i)/2);
            if(arr[mid]==amount){
                System.out.println("Found");
                return;
            }
            else if (arr[mid]>amount) {
                j=mid-1;
            }else {
                i=mid+1;
            }
        }
        System.out.println("Not Found");
    }
}
