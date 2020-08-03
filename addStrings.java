public class addStrings {
    public String  addStrings(String num1, String num2) {
        while(num1.length() < num2.length()) num1 = "0" + num1;     //预处理成等长字符串
        while(num2.length() < num1.length()) num2 = "0" + num2;
      StringBuffer buffer1 = new StringBuffer(num1).reverse();
      StringBuffer buffer2 = new StringBuffer(num2).reverse();
      StringBuffer sum = new StringBuffer();
      int flag=0;
      for (int i =0;i<buffer1.length();i++){
            int n1 = Integer.valueOf(""+buffer1.charAt(i));
          int n2 = Integer.valueOf(""+buffer2.charAt(i));
          sum.append((n1+n2+flag)%10);
          flag=(n1+n2+flag)/10;
      }
        if(flag == 1) sum.append(1);
      return sum.reverse().toString();
    }

    public static void main(String[] args) {
        addStrings t = new addStrings();
        String s = t.addStrings("98", "9");
        System.out.println(s);
    }
}
