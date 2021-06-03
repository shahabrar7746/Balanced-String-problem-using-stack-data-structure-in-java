import java.util.*;
public class Solution
{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    while(s.hasNext()){
        Stack<Character> st = new Stack();
        boolean flag = true;
        String ip =  s.nextLine();
        for(int i =0;i<ip.length();i++){
            char sign = ip.charAt(i);
            if(sign == '[' || sign == '{' || sign == '('){
                st.push(sign);
                continue;
            }
            if(st.isEmpty()){
                flag = false;
                break;
                
            }
            if(sign == '}'){
                if(st.peek() == '{'){
                    st.pop();
                }else{
                    flag =  false;
                    break;
                }
            }
             if(sign == ']'){
                if(st.peek() == '['){
                    st.pop();
                }else{
                    flag =  false;
                    break;
                }
            }
             if(sign == ')'){
                if(st.peek() == '('){
                    st.pop();
                }else{
                    flag =  false;
                    break;
                }
            }
            
            
        }
       if(!st.isEmpty()){
                flag = false;
               
            }
        System.out.println(flag);
        
    }
    }
}
