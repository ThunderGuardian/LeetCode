//Difficulty: Medium
//Runtime: 6 ms
//Memory: 57.04 MB
class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int min_height=Math.min(height[right],height[left]);
            int area=(right-left)*min_height;
            max=Math.max(area,max);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return(max);
        
    }
}
