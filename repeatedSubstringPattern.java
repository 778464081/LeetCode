class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for (int i=1;i*2<=s.length();i++){
            if (s.length()%i==0){
                 boolean flag = true;
                for (int j=i;j<s.length();j++){
                    if (s.charAt(j)!=s.charAt(j-i)){
                        flag=false;
                        break;
                    }
                }
                if (flag){
                    return true;
                }
            }
        }
        return false;
    }
}