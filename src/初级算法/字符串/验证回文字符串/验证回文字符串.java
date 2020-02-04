package 初级算法.字符串.验证回文字符串;

import java.util.Scanner;

class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s= s.replaceAll("[^a-z^A-Z^0-9]", "");
        int length=(int)((s.length()+1)/2);
        boolean flag=true;
        for (int i=0;i<length;i++){
            if (s.charAt(i)!=s.charAt(s.length()-i-1)){
                flag=false;
            }
        }
        return flag;
    }
}

public class 验证回文字符串 {
    public static void main (String[] args){
        Solution solution=new Solution();
        Scanner in = new Scanner(System.in);
        System.out.println("快填字符串");
        String s=in.nextLine();
        System.out.println(solution.isPalindrome(s));
    }
}
