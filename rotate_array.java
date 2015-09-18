public class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length; 
        
        if(k == 0 || nums.length == 0 || nums.length == k)
            return;
        
        patial_rotate(nums, 0, nums.length-1);
        patial_rotate(nums, 0, k-1);
        patial_rotate(nums, k, nums.length-1);
        
    }
    
    public void patial_rotate(int[] nums, int start, int end) {
        while(start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++ ;
            end-- ;
        }
    }
}
