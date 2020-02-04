package 初级算法.数组.从排序数组中删除重复项;
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(i==(n-1)) break;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    int a=nums[n-1];
                    nums[n-1]=nums[j];
                    nums[j]=a;
                    m++;
                    j--;
                    n=nums.length-m;
                }
            }
        }
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-i-1;j++)
                if(nums[j]>nums[j+1]){
                    int a=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=a;
                }
        return n;
    }
}
public class 从排序数组中删除重复项 {
    public static void main (String[] args){
        Solution solution=new Solution();
        int [] nums={1,2,3,3,2,1};
        for (int i=0;i<solution.removeDuplicates(nums);i++){
            System.out.print(nums[i]+" ");
        }
    }
}
