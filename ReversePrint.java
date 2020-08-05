package daily;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hjg
 * @date 2020/8/5 23:06
 */

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class ReversePrint {
    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head.next!=null){
            list.add(head.val);
            head=head.next;
        }
        int[] arr = new int[list.size()];
        int index = 0;
        for (int i=list.size()-1;i>=0;i--){
            arr[index] = list.get(i+1);
            index++;
        }

        return arr;
    }
}
