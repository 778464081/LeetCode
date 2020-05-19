package cn.ecut.day0519.demo05;

public class Aba {
        public boolean validPalindrome(String s) {
            int min=0;
            int max=s.length() -1;
            while(min<max){
                if(s.charAt(min)!=s.charAt(max)){
                    return isValid(s,min+1,max) || isValid(s,min,max-1);
                }
                min++;
                max--;

            }
            return true;
        }

        public boolean isValid(String s,int i,int j){
            while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }

    public static void main(String[] args) {
        Aba one =new Aba();
        System.out.println(one.validPalindrome("aba"));
        System.out.println("ccc");
    }
}
