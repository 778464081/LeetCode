package daily;

/**
 * @author hjg
 * @date 2020/8/5 22:46
 */
public class FindNumberIn2DArray {
    //线性查找
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0||matrix==null||matrix[0].length==0){
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int row = 0;
        int column = columns-1;
        while (row<rows&&column>=0){
            int temp = matrix[row][column];
            if (temp == target){
                return true;
            }else if(temp>target){
                column--;
            }else {
                row++;
            }
        }
        return false;
    }
}
