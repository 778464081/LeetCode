package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hjg
 * @date 2020/8/18 20:32
 */
public class T1 {
    public static int[][] merge(int[][] intervals){
        List<int[]> list = new ArrayList<>();
        if (intervals==null||intervals.length<=0){
            return list.toArray(new int[0][0]);
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int i=0;
        while (i<intervals.length){
            int t1=intervals[i][0];
            int t2=intervals[i][1];
            while (i<intervals.length-1 && intervals[i+1][0]<=t2){
                i++;
                t2 = Math.max(t2,intervals[i][1]);
            }
            list.add(new int[]{t1,t2});
            i++;
        }
        return list.toArray(new int[0][0]);
    }

    public static void main(String[] args) {
        int[][] a ={ {1,2},{2,4},{6,8},{7,9}};
        int[][] merge = merge(a);
        for (int[] arr:merge){
            for (int ar:arr){
                System.out.println(ar);
            }
        }
    }
}
