public class Solution {
    public boolean isValid(String s) {
        Stack<Character> r = new Stack<Character>();
        char [] a = s.toCharArray();
        for(char c:a){
          if(c=='(')
              r.push(')');
            
          else if(c=='[')
              r.push(']');
          
          else if (c=='{')
              r.push('}');
          
          else if (r.isEmpty()||r.pop()!=c)
              return false;
          
        }
        return r.isEmpty();
        
        
        
    }
}
