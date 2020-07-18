package Daily;

import java.util.*;

public class ContainsDuplicate {


    //垃圾算法！！！
//    public boolean containsDuplicate(int[] nums){
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0 ;i<nums.length;i++ ){
//            int count = map.getOrDefault(nums[i],0)+1;
//            if (count>1){
//                return false;
//            }else{
//                map.put(nums[i],count);
//            }
//        }
//        if (map.size()>nums.length){
//            return false;
//        }
//        return true;
//    }


    //排序
    //效率最高
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i =0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1])return true;
        }
        return false;
    }


    //效率低
//    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> set  = new HashSet<>();
//        for (int i =0;i<nums.length;i++){
//            if (set.contains(nums[i])){
//                return true;
//            }
//            set.add(nums[i]);
//        }
//        return false;
//    }
}
