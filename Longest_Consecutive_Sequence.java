//Difficulty: Medium
//Runtime: 13 ms
//Memory Usage: 56.8 MB

class Solution {
    //This solution is better by not using an extra array compared to previous solutions
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){ return(0);} 
        
        Arrays.sort(nums);
        int h=nums[0];
        int freq=1;
        int highest=1;
        //int arr[]=new int[nums.length];
        //int index=0;
 
            for(int i=0;i<nums.length;i++){
            if(nums[i]==h){
                continue;
            }
            else if(nums[i]==h+1){
                h=nums[i];
                freq++;
            }else if(nums[i]!=h){
                h=nums[i];
                //arr[index]=freq;
                highest=Math.max(freq,highest);
                freq=1;
                //System.out.println("New freq at index "+index+"is "+arr[index]);
                //index++;
            }
        }
        highest=Math.max(freq,highest);
        return(highest);

    
    }
}
