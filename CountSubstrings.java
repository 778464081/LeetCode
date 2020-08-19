package daily;

/**
 * @author hjg
 * @date 2020/8/19 22:30
 */
public class CountSubstrings {
    public int countSubstrings(String s) {
        int len = s.length();
        int count=0;
        for(int i=0;i<2*len-1;i++){
            int left = i/2;
            int right = i/2 + i%2;
            while (left >= 0 && right<len && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
                count++;
            }
        }
        return count;
    }
}
