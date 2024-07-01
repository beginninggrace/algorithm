import java.util.*;
class Solution {
    public String solution(String myString) {
        char[] chars = myString.toCharArray();
        int asciiToL = (int) 'l';
        
        for(int i=0; i<chars.length; i++) {
            int ascii = (int) chars[i];
            
            if(ascii<asciiToL) {
                chars[i] = 'l';
            }
        }
        return new String(chars);
    }
}