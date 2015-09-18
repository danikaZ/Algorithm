package group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> anagrams = new ArrayList<String>();
        List<List<String>> group = new ArrayList<List<String>>();
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        
        if(strs == null || strs.length == 0)
            return group;
        
        anagrams.add(strs[0]);
        group.add(anagrams);
        
        char[] str_char_1 = strs[0].toCharArray();
        Arrays.sort(str_char_1);
        String str_index1 = new String(str_char_1);
        hmap.put(str_index1, 0);
        for(int i = 1; i < strs.length ; i++){
            String str = strs[i];
            char[] str_char = str.toCharArray();
            Arrays.sort(str_char);
            String str_index = new String(str_char);
            
            if(str.length() == 0){
                str_index = str;
            }
            if(hmap.get(str_index)==null){
            	System.out.println(group.size());
                hmap.put(str_index, group.size());
                List<String> tmp_anagrams = new ArrayList<String>();
                tmp_anagrams.add(str);
                group.add(tmp_anagrams);
                
            }else{
                int array_index = hmap.get(str_index);
                group.get(array_index).add(str);
            }
        }
        for(int i = 0; i<group.size(); i++){
            if(group.get(i).size() > 0){
                Collections.sort(group.get(i));
            }
        }
        return group;
    }
    public static void main(String[] args){
    	Solution s = new Solution();
    	String[] strs = {"ate","eat","tea"};
    	s.groupAnagrams(strs);
    }
    
}