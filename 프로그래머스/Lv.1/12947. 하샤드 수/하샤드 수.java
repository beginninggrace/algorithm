import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean result = true;
        String save = ""+x;
        
        int Harshad=0;
        
        for(int i=0; i<save.length(); i++){
            Harshad+= (save.charAt(i)-'0');
        }
        
        result=(x%Harshad==0)? true:false;
        
        return result;
    }
}