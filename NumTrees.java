package daily;

public class NumTrees  {
//    int numTrees(int n) {
//        vector<int> G(n + 1, 0);
//        G[0] = 1;
//        G[1] = 1;
//
//        for (int i = 2; i <= n; ++i) {
//            for (int j = 1; j <= i; ++j) {
//                G[i] += G[j - 1] * G[i - j];
//            }
//        }
//        return G[n];
//    }
     int numTrees(int n) {
        // 提示：我们在这里需要用 long 类型防止计算过程中的溢出
        long C = 1;
        for (int i = 0; i < n; ++i) {
            C = C * 2 * (2 * i + 1) / (i + 2);
        }
        return (int) C;
    }
}
