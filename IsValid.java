package daily;

import java.nio.charset.Charset;
import java.util.*;

/**
 * @author hjg
 * @date 2020/8/14 9:58
 */
public class IsValid {

    private static final Map<Character,Character> map = new HashMap<>(){
        {
            put('{','}'); put('[',']'); put('(',')'); put('?','?');
        }
    };
    public static boolean isValid(String s) {
        if (s.length()%2!=0 && !map.containsKey(s.charAt(0))){
            return false;
        }
        LinkedList<Character> stack = new LinkedList<>(){{add('?');}};
        for (Character c:s.toCharArray()){
            if(map.containsKey(c)) stack.addLast(c);
            else if (map.get(stack.removeLast())!=c) return false;
        }

        return stack.size()==1;

    }

    public static boolean isValid2(String s) {
        if (s.isEmpty()||s.length()%2!=0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (Character c:s.toCharArray()){
            if (c=='('){
                stack.push(')');
            }
            else if (c=='{'){
                stack.push('}');
            }
            else if (c=='['){
                stack.push(']');
            }
            else if (stack.empty()||c!=stack.pop()){
                return false;
            }

        }return stack.empty();
    }



    public static void main(String[] args) {

        String s = "s";
        isValid(s);

    }
}
