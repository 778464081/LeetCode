package daily;

public class MindNum {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int count =0;
        int n1 =nums1.length;
        int n2 = nums2.length;
        int[] num = new int[n1+n2];
        if (n1==0){
            if (n2%2==0){
                return (nums2[n2/2-1] + nums2[n2/2]) /2.0;
            }else {
                return  nums2[n2/2];
            }
        }
        if (n2==0){
            if (n1%2==0){
                return (nums1[n1/2-1] + nums1[n1/2]) /2.0;
            }else {
                return  nums1[n1/2];
            }
        }
        int i=0;int j=0;
       while (count !=(n1 + n2)){
           if (nums1[i]<=nums2[j]){
               num[count++] = nums1[i++];
           }else{
               num[count++] = nums2[j++];
           }
           if (i==n1){
               while (j!=n2){
                   num[count++] = nums2[j++];
               }
           }
           if (j==n2){
               while (i!=n1){
                   num[count++] = nums1[i++];
               }
           }
       }
       if (count%2==0){
           return (num[count/2-1] + num[count/2]) /2.0;
       }else {
           return  num[count/2];
       }
    }

    public static void main(String[] args) {
            MindNum c =new MindNum();
            int[] a={1,3,5,7};
            int[] b={2,4,6,7};
            System.out.println(c.findMedianSortedArrays(a,b));
    }
}
