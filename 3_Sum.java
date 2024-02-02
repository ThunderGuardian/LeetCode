//Difficulty: Medium 
//Runtime: 33 ms
//Memory Usage: 51.2 MB

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> w = new ArrayList<Integer>();
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && (nums[i]!=nums[i-1]))){
            int j=i+1;
            int k=nums.length-1;
            

            while(j<k){
                int result=nums[i]+nums[j]+nums[k];
                if(result==0){
                
                   arr.add(Arrays.asList(nums[i], nums[j],nums[k]));
                   //System.out.println("ArrayList= "+arr);

                   while(j<k && nums[j]==nums[j+1]){
                       j++;
                   }
                   while(j<k && nums[k]==nums[k-1]){
                       k--;
                   }
                   j++;
                   k--;

                }
                else if(result>0){
                    k--;
                }
                else if(result<0){
                    j++;
                }

            }
            }
        }
        return(arr);
    }
}
