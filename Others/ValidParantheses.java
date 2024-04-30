class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> paranthesesStack = new Stack<>();

        for (char c : s.toCharArray()){
            if (c == '('){
                paranthesesStack.push(')');
            }
            else if (c == '['){
                paranthesesStack.push(']');
            }
            else if (c == '{'){
                paranthesesStack.push('}');
            }
            else if(paranthesesStack.isEmpty() || paranthesesStack.pop() != c){
                return false;
            }
        }

        return paranthesesStack.isEmpty();
    }
}