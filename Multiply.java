package daily;

/**
 * @author hjg
 * @date 2020/8/13 8:18
 */
public class Multiply {
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        String ans = "0";
        int m = num1.length(), n = num2.length();
        for (int i = n - 1; i >= 0; i--) {
            StringBuffer curr = new StringBuffer();
            int add = 0;
            for (int j = n - 1; j > i; j--) {
                curr.append(0);
            }
            int y = num2.charAt(i) - '0';
            for (int j = m - 1; j >= 0; j--) {
                int x = num1.charAt(j) - '0';
                int product = x * y + add;
                curr.append(product % 10);
                add = product / 10;
            }
            if (add != 0) {
                curr.append(add % 10);
            }
            ans = addString(ans, curr.reverse().toString());
        }
        return ans;

    }
    public static String addString(String n1,String n2){
        while (n1.length()<n2.length())n1="0"+n1;
        while (n1.length()>n2.length())n2="0"+n2;
        StringBuilder sb1 = new StringBuilder(n1).reverse();
        StringBuilder sb2 = new StringBuilder(n2).reverse();
        StringBuilder sb = new StringBuilder();
        int count =0;
        int a;
        int b;
        for (int i=0;i<sb1.length();i++) {
            a = sb1.charAt(i) - '0';
            b = sb2.charAt(i) - '0';
            sb.append((a + b+ count)%10);
            count = (a + b + count) / 10;
        }
        if (count>0){
            sb.append(count);
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(addString("9133","0"));
    }
}
