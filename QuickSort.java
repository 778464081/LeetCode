package daily;

public class QuickSort {
    public static void quickSort(int[] arr){
      int len = arr.length;
      int left = 0;
      int right = arr.length-1;
      if (len<=1||arr==null){
          return;
      }
      sort(arr,left,right);
    }
    public static void sort(int[] arr,int left ,int right){
        if (left>right){
            return;
        }
        int i = left;
        int j =right;
        int base = arr[left];
        while (i!=j){
            while (arr[j]>=base&&i<j){
                j--;
            }
            while (arr[i]<=base&&i<j){
                i++;
            }
            if (i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[left] = arr[i];
        arr[i] = base;
        sort(arr,left,i-1);
        sort(arr,i+1,right);

    }

    public static void main(String[] args) {
        int[] arr ={5,8,1,3,7,6,9,1,4};
        quickSort(arr);
        for (int a :arr){
            System.out.println(a);
        }
    }
}
