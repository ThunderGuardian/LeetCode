//Difficulty: Medium
//Runtime: 1 ms
//Memory Usage: 53.4 MB
//Without using the division operator
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        int prefix =1;
        int postfix =1;
        for(int j=0;j<nums.length;j++){
            arr[j]=prefix;
            prefix=prefix*nums[j];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            arr[i]=arr[i]*postfix;
            postfix=postfix*nums[i];
        }
        return(arr);
    }
}
