package test;

/**
 * @author hjg
 * @date 2020/8/18 22:52
 */
public class t2 {
   public boolean valid(String word, String abbr){
       int i=0;
       int j=0;
       String number = "";
       if (word.length()<abbr.length()){
           return false;
       }
       while (i<abbr.length() && j<word.length()){
           if (isNumber(abbr.charAt(i))){
               if (number==null && abbr.charAt(i)=='0'){
                   return false;
               }
               number+=abbr.charAt(i++);
           }else{
               if (number.length()>0){
                   j += Integer.parseInt(number);
                   number="";
               }
               if (word.charAt(j++)!=abbr.charAt(i++)){
                   return false;
               }
           }
       }
       if (number.length()>0){
           return Integer.parseInt(number)==word.length()-j;
       }
       return true;
   }
   public boolean isNumber(char c){
        if (c>=48 && c<=57){
            return true;
        }
        return false;
   }

    public static void main(String[] args) {
        t2 t2 = new t2();
        boolean valid = t2.valid("word", "wd");
        System.out.println(valid);
    }
}
