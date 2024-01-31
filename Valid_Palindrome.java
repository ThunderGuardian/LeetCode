//Difficulty:Easy

//1st solution (2nd solution is more efficient)
//Runtime: 250 ms
//Memory Usage: 45.9 MB
class Solution {
    public boolean isAlphaNumeric(char f){
        return (f >= 'a' && f <= 'z') ||
           (f >= 'A' && f <= 'Z') ||
           (f >= '0' && f <= '9');
    }
    public boolean isPalindrome(String s) {
        boolean result;
        String s1="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isAlphaNumeric(c)){
                s1+=Character.toLowerCase(c);
            }else{
                continue;
            }
        }
        String rs="";
        for(int i=s1.length()-1;i>=0;i--){
            rs+=s1.charAt(i);
        }
        System.out.println("S1= "+s1);
        System.out.println("RS= "+rs);
        if(s1.equals(rs)){
            result=true;
        }else{result=false;}
    return(result);
    }
}


//2nd Solution efficient than the the 1st solution
//Runtime: 2 ms
//Memory Usage: 42.6 MB
class Solution {
    public boolean isAlphaNumeric(char f){
        return (f >= 'a' && f <= 'z') ||
           (f >= 'A' && f <= 'Z') ||
           (f >= '0' && f <= '9');
    }
    public boolean isPalindrome(String s) {
        boolean result=true;
        int j=s.length()-1;
        int i=0;
        while(i<j){
            if(!isAlphaNumeric(s.charAt(i))){
                i++;
                continue;
            }
            if(!isAlphaNumeric(s.charAt(j))){
                j--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))){
                i++;
                j--;             
            }
            else{
                return(false); 
            }
        }
    return(result);
    }
}
