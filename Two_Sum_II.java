//Difficulty: Medium
//Runtime: 3 ms
//Memory Usage: 47.7 MB
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start= 0;
        int end = numbers.length-1;
        int num1,num2;
        while(start<end){
            num1=numbers[start];
            num2=numbers[end];
            if(num1+num2==target){
                break;
            }
            if(num1+num2>target){
                end--;
            }
            if(num1+num2<target){
                start++;
            }
        }
        return new int[]{start+1,end+1};
    }
    }
