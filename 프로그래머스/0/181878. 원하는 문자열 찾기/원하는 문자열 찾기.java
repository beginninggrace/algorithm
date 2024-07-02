import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        String myStrings = myString.toLowerCase();
        String pats = pat.toLowerCase();
        
        if(myStrings.contains(pats)) {
            return 1;
        }else {
            return 0;
        }
    }
}