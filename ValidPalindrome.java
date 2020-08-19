package daily;

/**
 * @author hjg
 * @date 2020/8/19 23:06
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                sb.append(Character.toUpperCase(ch));
            }
        }
        StringBuffer bs = new StringBuffer(sb).reverse();
        return sb.toString().equals(bs.toString());
    }

    public static void main(String[] args) {
//        String s ="A man, a plan, a canal: Panama";
//        isPalindrome(s);
        StringBuffer sb = new StringBuffer();
        sb.append("ac").append("c");
        StringBuffer reverse = sb.reverse();
        StringBuffer sgood_rev = new StringBuffer(sb).reverse();
        System.out.println(sb.toString());
        System.out.println(reverse.toString());
    }
}
