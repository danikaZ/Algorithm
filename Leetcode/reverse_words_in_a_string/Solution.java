package reverse_words_in_a_string;

public class Solution {
    public String reverseWords(String s){
        if (s == null || s.length() == 0)
			return "";
		
        String[] words = s.split(" ");
        int len = words.length;
        StringBuilder sb = new StringBuilder();

        for(int i = len-1; i >= 0 ; i--){
            String word = words[i];
            if(word.length()>0){
            	sb.append(word).append(" ");
            }
            
        }
        
        return sb.toString().replaceAll(" +$", "");
    }
    
    public static void main(String[] args){
    	Solution s = new Solution();
    	String result = s.reverseWords(" 1");
    	System.out.println("result:"+result +".");
    }
    
}