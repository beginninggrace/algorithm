import java.util.HashSet;

class Solution {
        public int solution(int[] nums) {
            int maxLength = nums.length / 2;
            HashSet<Integer> numSet = new HashSet<>();

            for (int num : nums) {
                numSet.add(num);
            }

            if(numSet.size() > maxLength) {
                return maxLength;
            } else {
                return numSet.size();
            }
        }
    }