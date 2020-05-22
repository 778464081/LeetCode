package daily;

public class LongestPalindrome {
    // 暴力破解
//    public String longest(String s) {
//        String other="";
//        String last ="";
//        int num=0;
//        for (int i =0;i<s.length();i++){
//            for (int j=s.length();j>i;j--){
//                other = s.substring(i, j);
//                if (num < stt(other)) {
//                    num = stt(other);
//                    last = other;
//                }
//            }
//        }
//        return last;
//
//    }
//    public int stt(String m){
//        int i=0;
//        int j=m.length()-1;
//        while(i<j){
//            if(m.charAt(i)!=m.charAt(j)){
//                return  0;
//            }else {
//                i++;
//                j--;
//            }
//        }
//        int num = m.length();
//        return num;
//    }

//  java 动态规划

//    public String longest(String s) {
//        if (s.length() < 2) return s;
//        char[] chs = s.toCharArray();
//        int n = chs.length;
//        boolean[][] dp = new boolean[n][n];
//        int[] res = new int[2];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i - 1; j <= i && j >= 0; j++) {
//                dp[i][j] = true;
//            }
//        }
//
//        for (int i = n - 1; i >= 0; i--) {
//            for (int j = i + 1; j < n; j++) {
//                dp[i][j] = chs[i] == chs[j] && dp[i + 1][j - 1];
//                if (dp[i][j] && j - i > res[1] - res[0]) {
//                    res[0] = i;
//                    res[1] = j;
//                }
//            }
//        }
//
//        return s.substring(res[0], res[1] + 1);
//    }
//中心扩散法
    public String longest(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxLen = 1;
        String res = s.substring(0, 1);
        // 中心位置枚举到 len - 2 即可
        for (int i = 0; i < len - 1; i++) {
            String oddStr = centerSpread(s, i, i);
            String evenStr = centerSpread(s, i, i + 1);
            String maxLenStr = oddStr.length() > evenStr.length() ? oddStr : evenStr;
            if (maxLenStr.length() > maxLen) {
                maxLen = maxLenStr.length();
                res = maxLenStr;
            }
        }
        return res;
    }

    private String centerSpread(String s, int left, int right) {
        // left = right 的时候，此时回文中心是一个字符，回文串的长度是奇数
        // right = left + 1 的时候，此时回文中心是一个空隙，回文串的长度是偶数
        int len = s.length();
        int i = left;
        int j = right;
        while (i >= 0 && j < len) {
            if (s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            } else {
                break;
            }
        }
        // 这里要小心，跳出 while 循环时，恰好满足 s.charAt(i) != s.charAt(j)，因此不能取 i，不能取 j
        return s.substring(i + 1, j);
    }

    public static void main(String[] args) {
        LongestPalindrome a =new LongestPalindrome();
        System.out.println(a.longest("acaaca"));
    }
}
