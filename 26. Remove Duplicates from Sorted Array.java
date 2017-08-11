public class Solution {
    public int removeDuplicates(int[] nums) {
       int x = 1;
       int y = 0;
       for(;x<nums.length;x++){
           if(nums[x]!=nums[y]){
               y++;
               nums[y]=nums[x];
               
           }
           
       }
       return y+1;
    }
}
