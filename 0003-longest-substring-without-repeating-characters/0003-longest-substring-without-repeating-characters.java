import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Integer[] chars = new Integer[128];
        int answer = 0;
        int left=0, right=0;
        
        while(right < s.length()) {
            char r = s.charAt(right);
            
            Integer index = chars[r];
            if(index != null && left <= index && index < right) {
                left = index+1;
            }
            
            answer = Math.max(answer, right - left + 1);
            chars[r] = right;
            right++;
        }
        
        return answer;
    }
}