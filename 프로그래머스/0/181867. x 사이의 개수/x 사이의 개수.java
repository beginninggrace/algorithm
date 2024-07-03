class Solution {
    public int[] solution(String myString) {
        String[] separate = myString.split("x", -1);
        int[] result = new int[separate.length];
        
        for(int i = 0; i<separate.length; i++) {
            result[i] = separate[i].length();
        }
        return result;
    }
}