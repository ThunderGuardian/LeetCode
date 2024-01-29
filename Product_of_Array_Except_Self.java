//Difficulty: Medium
//Runtime: 1 ms
//Memory Usage: 53.4 MB
//Without using the division operator
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        int prefix =1;
        int postfix =1;
        //Putting the prefix of each element in the new array at the respective index. Hence this loop goes from the start index till the end index
        for(int j=0;j<nums.length;j++){
            arr[j]=prefix;
            prefix=prefix*nums[j];
        }
        //And then multiplying the prefix of the respective element with its prostfix. Hence this for loop goes from the end of the nums[] till the start
        for(int i=nums.length-1;i>=0;i--)
        {
            arr[i]=arr[i]*postfix;
            postfix=postfix*nums[i];
        }
        return(arr);
    }
}
