package Algos;

import java.nio.charset.StandardCharsets;

public class PalindromeChecker {

    public boolean isPalindrome(int[] arr,int index) {
        int number=arr[index];
        char[] data = String.valueOf(number).toCharArray();
        int j = data.length-1;
        int i = 0;

        while (i < j) {
            if (data[i] != data[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
