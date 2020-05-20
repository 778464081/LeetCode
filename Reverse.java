package cn.ecut.day0520.daily;
public class Reverse {
    public int reverse(int x) {
        long y=0;
        while(x!=0){
            y = y*10 + x%10;
            x/=10;
            if(y>2147483647||y<-2147483648){
                return 0 ;
            }
        }
        return  (int)y;
    }
    public static void main(String[] args) {
        Reverse rev =new Reverse();
        System.out.println(rev.reverse(-516515615));
    }
}
