class Solution {
    public String solution(String my_string, int num1, int num2) {
        //배열로 변환
        char[] arr = my_string.toCharArray();
        
        //배열 arr[num1]에 my_string의 인덱스 번호 num2의 문자 대입
        arr[num1] = my_string.charAt(num2);
        //배열 arr[num2]에 my_string의 인덱스 번호 num1의 문자 대입
        arr[num2] = my_string.charAt(num1);
        
        //배열 arr을 String 객체로 반환하기 위해 vauleOf() 메서드 사용
        return String.valueOf(arr);
    }
}