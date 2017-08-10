public class Solution {
    public int reverse(int x) {
        long numreserve = 0;
        
    
        while(x!=0){
        if(numreserve >= Integer.MIN_VALUE && numreserve <= Integer.MAX_VALUE){
         int tail=x%10;
         int temp = numreserve*10+tail;
         numreserve= temp;
         x=x/10;
        }
        else
        return 0;
         
        }
        return numreserve;
      
      
    }
}
