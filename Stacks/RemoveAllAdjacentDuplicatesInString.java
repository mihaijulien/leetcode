class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> charStack = new Stack<>();
        
        for(Character c : s.toCharArray()){
            if(!charStack.isEmpty() && charStack.peek() == c){
                charStack.pop();
            } else {
                charStack.push(c);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!charStack.isEmpty()){
            sb.append(charStack.pop());
        }
        
        return sb.reverse().toString();
    }
}
