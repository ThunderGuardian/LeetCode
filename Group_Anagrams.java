//Difficulty: Medium
//Runtime: 7 ms
//Memory Usage: 47 MB

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(); //Hashmap where key:sorted word and value: the different words belonging to that key

//For each word in the string make a sorted copy of that word
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

//If the sorted word is not there then add it as a new key
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

//Once the key is present add the word as one of the values of that respective key(ie: Sorted word)
            map.get(sortedWord).add(word);
        }
        
//Returning an array list of the grouped words in the map based on their respective key(ie: Sorted word)         
        return new ArrayList<>(map.values());
    }
    }
