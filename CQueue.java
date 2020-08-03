import java.util.LinkedList;

public class CQueue {
    LinkedList<Integer> stack1 ;
    LinkedList<Integer> stack2 ;
    public CQueue(){
        stack1 =new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value){
        stack1.addLast(value);
    }

    public int deleteHead(){
        if (!stack2.isEmpty()){
           return stack2.removeLast();
        }
        if (stack1.isEmpty()){
            return -1;
        }
        while (!stack1.isEmpty()){
            stack2.addLast(stack1.removeLast());
        }
        return stack2.removeLast();
    }

}
