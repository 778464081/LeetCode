package daily;

/**
 * @author hjg
 * @date 2020/8/11 22:14
 */
 class ListNode {
   int val;
  ListNode next;
   ListNode(int x) { val = x; }
  }
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newL1 = new ListNode(0);
        ListNode newL2 =newL1;
        while (l1!=null&&l2!=null){
            if (l1.val<=l2.val){
                newL2.next = l1;
                l1=l1.next;
                newL2=newL2.next;
            }
            if (l1.val>l2.val){
                newL2.next=l2;
                l2=l2.next;
                newL2=newL2.next;
            }
        }
        if (l1!=null){
            newL2.next=l1;
        }else {
            newL2.next=l2;
        }
        return newL1.next;
    }

    public static void main(String[] args) {

    }

}
