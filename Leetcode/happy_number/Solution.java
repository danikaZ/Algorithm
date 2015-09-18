package happy_number;

public class Solution {
    public boolean isHappy(int n) {
        int previous = Integer.MAX_VALUE;
        if( n < 10)
            n = n*n;
        while(true && previous!= n){
            if(n == 1)
                return true;
            previous = n;
            int internal = 0;
            while(true){                
                int tmp = n%10;
                n = n/10;
                internal += tmp*tmp;
                if(n < 10){
                    internal += n*n;
                    break;
                }
            }
            if(internal == 1){
                return true;
            }else if(internal < 10){
            	return false;
            }
            n = internal;
        }
        return false;
    }
    
    public static void main(String[] args){
    	int test = 9;
    	Solution s = new Solution();
    	boolean result = s.isHappy(test);
    	System.out.println(result);
    }
}
