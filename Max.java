package daily;

public class Max {

//    暴力解法
//    public int maxArea(int[] height) {
//        int total =0;
//        int Smax =0;
//        for(int i=0;i<height.length;i++){
//            for (int j=i+1;j<height.length;j++){
//                Smax =Math.min(height[i],height[j]) * (j-i);
//                total =Math.max(Smax,total);
//            }
//        }
//        return  total;
//    }
//
//    双指针算法
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int Smax;
        int total=0;
        while(l<r){
            Smax = Math.min(height[l],height[r]) *(r-l);
            total =Math.max(total,Smax);
            if (height[l]<=height[r]){
                l++;
            }else{
                r--;
            }
        }
        return total;

    }

    public static void main(String[] args) {
        Max a =new Max();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(a.maxArea(arr));
    }


}
