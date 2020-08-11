class Solution {
    public char firstUniqChar(String s) {
        Map<Character,Boolean> map = new HashMap<>();
        char[] sc = s.toCharArray();
        for(char mm:sc){
             map.put(mm, map.containsKey(mm));
        }
        for(char nn:sc){
            if(!map.get(nn)){
                return nn;
            }
        }
        return ' ';

    }
}