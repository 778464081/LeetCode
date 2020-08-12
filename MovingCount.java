package daily;

/**
 * @author hjg
 * @date 2020/8/12 22:38
 */
public class MovingCount {
    public int movingCount(int m, int n, int k) {
        //临时变量visited记录格子是否被访问过
        boolean[][] visited = new boolean[m][n];
        return dfs(0, 0, m, n, k, visited);
    }
    public int dfs(int i,int j,int m,int n,int k,boolean[][] visited){
        if (i>=m||j>=n||k<sum(i,j)||visited[i][j]){
            return 0;
        }
        visited[i][j]=true;
        return 1 + dfs(i + 1, j ,m, n, k, visited) + dfs(i, j + 1, m, n, k, visited);
    }

    public int sum(int i,int j){
        int sum =0;
        while (i!=0){
            sum +=i%10;
            i/=10;
        }
        while (j!=0){
            sum +=j%10;
            j/=10;
        }
        return sum;
    }
}
