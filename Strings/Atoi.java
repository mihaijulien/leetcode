class Solution {
    public int myAtoi(String s) {
        
        String trimmedString = s.trim();
        int sign = 1;
        int index = 0;
        int result = 0;
        
        if(trimmedString.isEmpty()){
            return 0;
        }
        
        if(trimmedString.charAt(index) == '-'){
            sign = -1;
            index++;
        } else if(trimmedString.charAt(index) == '+'){
            sign = 1;
            index++;
        } 
        // if string doesn't start with the sign -/+ index remains 0
        
        while(index < trimmedString.length() && Character.isDigit(trimmedString.charAt(index))){
            int digit = trimmedString.charAt(index) - '0';
            if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)){
                if(sign == -1){
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }
            result = result * 10 + digit;
            index++;
        }
        
        return result * sign;
    }
}