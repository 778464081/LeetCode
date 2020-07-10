import javafx.css.converter.LadderConverter;

public class AddtwoNumber {
     public static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode node = new ListNode(0);
         ListNode pro = node;
         int carry =0;
         while (l1!=null||l2!=null){
             int x = l1!=null?l1.val:0;
             int y =l2!=null?l2.val:0;
             int sum =carry + x + y ;
             carry = sum/10;
             pro.next = new ListNode(sum%10);
             pro=pro.next;
             if (l1!=null)l1 = l1.next;
             if (l2!=null)l2=l2.next;
         }
         if (carry ==1){
             pro.next = new ListNode(1);
         }
         return node.next;
    }

    public static void main(String[] args) {
         ListNode a= new ListNode(9);
         a.next =new ListNode(5);
         ListNode b =new ListNode(1);
         b.next = new ListNode(5);
        ListNode x =addTwoNumbers(a,b);
        while (x!=null){
            System.out.println(x.val);
            x=x.next;
        }
    }
}
