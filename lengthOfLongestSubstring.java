package test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hjg
 * @date 2020/8/26 23:03
 */
public class T5 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int right =-1;
        int ans =0;
        for (int i=0;i<s.length();i++){
            if (i!=0){
                set.remove(s.charAt(i-1));
            }
            while (right+1<s.length() && !set.contains(s.charAt(right+1))){
                set.add(s.charAt(right+1));
                right++;
            }
            ans = Math.max(ans,right+1-i);
        }
        return ans;
    }
}
