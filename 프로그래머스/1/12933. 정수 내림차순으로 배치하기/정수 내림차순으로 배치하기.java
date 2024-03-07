import java.util.*;

class Solution {
    public long solution(long n) {
        String [] save = String.valueOf(n).split("");  
        Arrays.sort(save);
        
        String str= String.join("",save);
        
        StringBuilder sb = new StringBuilder(str);
        long result = Long.parseLong(sb.reverse().toString());
        return result;
    }
}