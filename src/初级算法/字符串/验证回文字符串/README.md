# 验证回文字符串

---

给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

说明：本题中，我们将空字符串定义为有效的回文串。

---
示例 1:
```txt
输入: "A man, a plan, a canal: Panama"
输出: true
```
示例 2:
```txt
输入: "race a car"
输出: false
```
---
Java
```Java
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
```