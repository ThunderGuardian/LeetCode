//Difficulty: Medium
//Runtime: 6ms
//Memory: 43.06 mb
class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> subL=new ArrayList<>();
        int l=0;
        int largest=0;
        for(int r=0;r<s.length();r++){
            if(subL.contains(s.charAt(r))){
                int index=subL.indexOf(s.charAt(r));
                subL.remove(index);
                if(index>0) //This removes all the characters before the repeated char in the substring
                {  
                    subL.subList(0,index).clear();
                }
            }
            subL.add(s.charAt(r));
            largest=Math.max(largest,subL.size());
            
        }
        return largest;
            
        
    }
}
