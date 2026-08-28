import Algos.*;
import Store.ClaimAmountStore;
import Exception.*;

public class HdfcClaimAmountAlgorithms {
    static void main(String[] args) {
        ClaimAmountStore store=new ClaimAmountStore();


    try {
        store.add(25000);
        store.add(18081);
        store.add(42000);
        store.add(15000);
        store.add(31000);
        store.add(9000);
    }catch (StoreFullException e){
        System.out.println("Exception"+ e.getMessage());
    }


        PairSumSolver solver= new PairSumSolver();
        int data[]=store.toArray();
        try {
            int[] arr = solver.pairSumNested(data, 57000);
            System.out.println(arr[1] + " + " + arr[0]);
        } catch (PairNotFoundException e) {
            System.out.println("Exception"+ e.getMessage());
        }

        PalindromeChecker checker=new PalindromeChecker();
        System.out.println(checker.isPalindrome(data,1));

        Partition partitoner=new Partition();
        int[] patitionedArray=partitoner.partition(data);

        SlidingWindowMax slidingWindowMax=new SlidingWindowMax();
        try {
            slidingWindowMax.getMax(data,-1);
        } catch (InvalidWindowException e) {
            System.out.println("Exception"+ e.getMessage());
        }


        UniqueSubstringSolver uniqueSubstringSolver=new UniqueSubstringSolver();
        System.out.println(uniqueSubstringSolver.getLongestSunbstring("Mittesh"));

        BinarySearch search=new BinarySearch();
        search.findAmount(15002,data);
    }
}
