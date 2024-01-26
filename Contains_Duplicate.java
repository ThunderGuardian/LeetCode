//Difficulty: Easy
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int size=nums.length;
        HashSet<Integer>set=new HashSet(size);
        int n=0;
//Putting all the elements of the given array in this set
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                n=1;
                break;
            }
            else{
                set.add(nums[i]);
            }
        }
        if(n==1){
            return true;
        }else{
            return false;
        }
    
}
}

