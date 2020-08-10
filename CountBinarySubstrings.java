import java.util.ArrayList;
import java.util.List;

/**
 * @author hjg
 * @date 2020/8/10 9:50
 */
public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        List<Integer> list = new ArrayList<>();
        int pre=0;
        int n = s.length();
        while (pre<n){
            char c = s.charAt(pre);
            int count = 0;
            while (pre<n&&c==s.charAt(pre)){
                pre++;
                count++;
            }
            list.add(count);
        }
        int ans=0;
        for (int i=1;i<list.size();i++){
            ans+=Math.min(list.get(i),list.get(i-1));
        }
        return ans;
    }


}
