public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int numreserve = 0;
        int y =x;
    
        while(y!=0){
         
        numreserve = numreserve*10+y%10;
        
         y=y/10;
         
        }
        return numreserve==x;
        
    }
}
