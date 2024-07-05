class Solution {
    public String solution(String myString) {
        String lowerAlp = myString.toLowerCase();
        char[] result = lowerAlp.toCharArray();
        for(int i = 0; i<result.length; i++) {
            if(result[i] == 'a') {
                result[i] = Character.toUpperCase(result[i]);
            }
        }return new String(result);
    }
}