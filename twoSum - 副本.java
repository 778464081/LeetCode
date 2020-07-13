package daily;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

    //暴力破解法
//    public int[] two(int[] nums, int target) {
//        int[] count =new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j =i+1;j<nums.length;j++){
//                if ((nums[i] +nums[j]) ==target ){
//                    count[0]=i;
//                    count[1]=j;
//                }
//            }
//        }
//        return  count;
//    }

    //哈希映射
    public static int[] two(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
            if (map.containsKey(target-nums[i])){
                return new int[] {map.get(target-nums[i]),i};
            }

        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums ={2, 7, 11, 15};
        int[] ints = twoSum.two(nums, 13);
        for (int i = 0; i < 2; i++) {
            System.out.print(ints[i]);
        }

    }
}
