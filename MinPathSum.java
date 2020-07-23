package daily;

public class MinPathSum {
    public static int minPathSum(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        int[][] temp = new int[x][y];
        temp[0][0] =grid[0][0] ;
        for (int i = 1; i <x ; i++) {
            temp[i][0] = temp[i-1][0] +grid[i][0];
        }
        for(int j =1;j<y;j++){
            temp[0][j] = temp[0][j-1]+grid[0][j];
        }
        for (int i = 1;i<x;i++){
            for (int j = 1; j<y;j++){
                temp[i][j] = Math.min(temp[i-1][j],temp[i][j-1]) + grid[i][j];
            }
        }
        return temp[x-1][y-1];
    }

    public static void main(String[] args) {
        int[][] arr ={
                {1,3,1},
                {1,5,1},
                {4,2,1}};
        System.out.println(minPathSum(arr));
    }
}
