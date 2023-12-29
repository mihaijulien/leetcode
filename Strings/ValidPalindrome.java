class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        s = s.toLowerCase();
        StringBuilder palindrome = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                palindrome.append(c);
            }
        }
        
        System.out.println(palindrome);
        
        for(int i=0; i<palindrome.length() / 2; i++){
            if(palindrome.charAt(i) != palindrome.charAt(palindrome.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}