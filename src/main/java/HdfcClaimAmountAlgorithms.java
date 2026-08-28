import Algos.*;
import Store.ClaimAmountStore;

public class HdfcClaimAmountAlgorithms {
    static void main(String[] args) {
        ClaimAmountStore store=new ClaimAmountStore();

        store.add(25000);
        store.add(18081);
        store.add(42000);
        store.add(15000);
        store.add(31000);
        store.add(9000);
        PairSumSolver solver= new PairSumSolver();
        int data[]=store.toArray();

        int[] arr=solver.pairSumNested(data,57000);
        System.out.println(arr[1] +" + "+ arr[0]);

        PalindromeChecker checker=new PalindromeChecker();
        System.out.println(checker.isPalindrome(data,1));

        Partition partitoner=new Partition();
        int[] patitionedArray=partitoner.partition(data);

        SlidingWindowMax slidingWindowMax=new SlidingWindowMax();
        slidingWindowMax.getMax(data,3);

        UniqueSubstringSolver uniqueSubstringSolver=new UniqueSubstringSolver();
        System.out.println(uniqueSubstringSolver.getLongestSunbstring("Mittesh"));

        BinarySearch search=new BinarySearch();
        search.findAmount(15002,data);
    }
}
