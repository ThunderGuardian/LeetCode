//Difficulty: Easy
//Runtime: 9 ms
//Memory Usage: 56.3 MB
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

