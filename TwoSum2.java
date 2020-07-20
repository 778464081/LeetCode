package daily;

public class TwoSum {
    public int[] two(int[] numbers,int target){
        int left =0;
        int right = numbers.length-1;
        while (left<right){
            int count = numbers[left]+numbers[right];
            if (count == target){
               return new int[]{left+1,right+1};
            }else if(count<target){
                right--;
            }else {
                left++;
            }
        }
        return null;
    }

//    public  int[] two(int[] numbers,int target){
//        int[] arr = new int[2];
//        for (int i=0;i<numbers.length-1;i++){
//            for (int j =i+1;j<numbers.length;j++){
//                int count = numbers[i]+numbers[j];
//                if (count==target){
//                    arr[0]=i+1;
//                    arr[1]=j+1;
//                }
//            }
//        }
//        return arr;
//    }
}
