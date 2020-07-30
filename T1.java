package Test;


import java.util.*;

public class T1 {
    List<String> res = new LinkedList<>();
    char[] c;

    public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }
    //进行递归
    void dfs(int x) {
        if (x == c.length - 1) {
            res.add(String.valueOf(c));  // 添加排列方案
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = x; i < c.length; i++) {
            if (set.contains(c[i])) continue;  // 重复，因此剪枝
            set.add(c[i]);
            swap(i, x);  // 交换，将 c[i] 固定在第 x 位
            dfs(x + 1);  // 开启固定第 x + 1 位字符
            swap(i, x);  // 数据还原
        }
    }
    //交换
    void swap(int a, int b) {
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }
    public static void main(String[] args) {
        T1 t1 = new T1();
        String[] abcds = t1.permutation("abcd");
        for (String s:abcds){
            System.out.print(s+" ");
        }
    }
}
