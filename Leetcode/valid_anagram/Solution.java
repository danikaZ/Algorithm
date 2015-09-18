package valid_anagram;

import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        char[] sch = s.toCharArray();
        char[] tch = t.toCharArray();
        
        for(int i = 0; i < sch.length; i++){
            if(hmap.keySet().contains(Character.valueOf(sch[i]))) {
                hmap.put(Character.valueOf(sch[i]), hmap.get(Character.valueOf(sch[i])) + 1);
            }else{
                hmap.put(Character.valueOf(sch[i]), 1);
            }
        }
        
        for(int i = 0; i < tch.length; i++){
            if(hmap.keySet().contains(Character.valueOf(tch[i]))) {
                if(hmap.get(Character.valueOf(tch[i])) - 1 < 0)
                    return false;
                hmap.put(Character.valueOf(tch[i]), hmap.get(Character.valueOf(tch[i])) - 1);
            }else{
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
    	Solution s = new Solution();
    	System.out.println(s.isAnagram("ab", "ba"));
    }
}
