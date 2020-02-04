package 初级算法.动态规划.爬楼梯;
class Solution {
    public int climbStairs(int n) {
        int num=0;
        for(int i=0;i<=n;i++)
            for(int j=0;j<=n;j++)
                if(i*2+j>=n){
                    if(i*2+j==n){
                        int x=0;
                        int a=0,b=0,c=0;
                        System.out.println("(2) X "+i+";  (1) X "+j);
                        if (i > j) a = i;
                        else a = j;
                        b=i+j-a;
                        if (b==0){
                            x=1;
                        }else if (b==1){
                            x=a+1;
                        }else {
                            for(int m=0;m<b;m--)
                                c=(a+1)*b;
                        }
                        num=num+c+x;
                    }
                    break;
                }
        return num;
    }
}

public class 爬楼梯 {
    public static void main (String[] args){
        int print=new Solution().climbStairs(7);
        System.out.println(print);
    }
}