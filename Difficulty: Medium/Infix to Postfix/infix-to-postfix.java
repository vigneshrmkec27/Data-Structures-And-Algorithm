class Solution {
    public static int precedence(char ch)
        {
            switch(ch){
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
                case '^':
                    return 3;
                
            }
            return -1;
        }
    public static String infixToPostfix(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
       for(char ch:s.toCharArray())
       {
           if(Character.isLetterOrDigit(ch))
           {
               result.append(ch);
           }
           else if(ch=='(')
           {
               stack.push(ch);
           }
           else if(ch==')')
           {
               while(!stack.isEmpty() && stack.peek() !='(')
               {
                   result.append(stack.pop());
               }
               if(!stack.isEmpty() && stack.peek() =='(') {
                   stack.pop();
               }
           }
           else{
           while(!stack.isEmpty() &&  precedence(ch)<= precedence(stack.peek()))
           {
               result.append(stack.pop());
           }
           stack.push(ch);
           }
       }
       while(!stack.isEmpty())
       {
           result.append(stack.pop());
       }
        return result.toString();
    }
}