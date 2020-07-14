package daily;

import java.util.List;

public class MinimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();//获得三角形的行数
        int[][] dp = new int[n+1][n+1];
        for (int i=n-1;i>=0;i--){
            for (int j=0;j<=i;j++){
                dp[i][j] = Math.min(dp[i+1][j],dp[i+1][j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] a = new int[10][10];
        System.out.println(a[9][9]);
    }
}
