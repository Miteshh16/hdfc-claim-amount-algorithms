package Algos;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubstringSolver {

    public int getLongestSunbstring(String s){
        Set<Character> set=new HashSet<>();
        char[] charArray=s.toCharArray();
        int maxSize=0;
        for(int i=0,j=0;i<charArray.length;i++){
            if(set.contains(charArray[i])){
                while (set.contains(charArray[i])) {
                    set.remove(charArray[j]);
                    j++;
                }
            }else{
                set.add(charArray[i]);
                maxSize = Math.max(maxSize, (i - j + 1));
            }
        }
        return maxSize;
    }
}
