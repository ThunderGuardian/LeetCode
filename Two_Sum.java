//Difficulty: Easy

//1st Solution
//Runtime: 45 ms
//Memory Usage: 43.8 MB
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        int y=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int output=nums[i]+nums[j];
                if(output==target){
                    arr[0]=i;
                    arr[1]=j;
                    y=1;
                    break; 
                }
                else{
                    continue;
                }
            
            }
            if(y==1){
                break;
            }
        }
        return arr;
    }
}


//2nd Solution (Efficient one)
//Runtime: 1-2 ms
//Memory Usage: 43.5 MB
class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> map = new HashMap<>(); //value : index
      int arr[]=new int[2];
      for(int i=0;i<nums.length;i++){
          int result= target-nums[i];
          if(map.containsKey(result)==false){
              map.put(nums[i],i);
          }else{
              arr[0]= map.get(result);
              arr[1]=i;
              break;
          }

      }
      return arr;
    }
}

