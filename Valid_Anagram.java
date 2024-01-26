//Difficulty: Easy
//Runtime: 18 ms
//Memory Usage: 43.7 MB

import java.util.*; 
class Solution {
    public boolean isAnagram(String s, String t) {
        int size1 =s.length();
        int size2 = t.length();
        int result=0;
        Dictionary <Character, Integer> dict = new Hashtable<>();  
        if(size1!=size2){
            return false;
        }
//Adding all the characters of string s in a dictionary with the count for each character
        for(int i=0;i<size1;i++){
            char c=s.charAt(i);
            if(dict.get(c) != null){
                dict.put(c,dict.get(c)+1);//Incrementing the count for each character of the string s 

            }
            else{
                dict.put(c,1);//Adding a new unique character to the dictionary
            }
        }
//Checking the string t with the characters added from string s to the dictionary dict
        for(int i=0;i<size1;i++){
            char d=t.charAt(i);
            if(dict.get(d) != null){
                if(dict.get(d)==1){
                    dict.remove(d);
                }else{
                    dict.put(d,dict.get(d)-1);
                }
               

            }
            else{
                break; //Character not in dictionary so not anagram
            }

        }


        if(dict.isEmpty()){
            return true;
        }else{
            return false;
        }




    }
}
