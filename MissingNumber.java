package daily;

public class MissingNumber {
    //笨方法
//    public int missingNumber(int[] nums){
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]!=i){
//                return i;
//            }
//        }
//        return nums.length;
//    }



    //二分查找
    public int missingNumber(int[] nums){
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] == m) i = m + 1;
            else j = m - 1;
        }
        return i;
    }
}
