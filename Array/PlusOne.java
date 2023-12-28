class Solution {
    public int[] plusOne(int[] digits) {
        // if last digit != 9 => increment last digit and return array
        
        // if last digit is 9,  start looping through array and replace all 9s with 0s & the first digit < 9 increment w/ 1
        
        // all digits 9 => new array digits.length + 1 => all elements 0 and digits[0] = 1;
        
        if(digits[digits.length - 1] < 9){ // [1,2,3]
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            
            return digits;
        }
        
        if(digits[0] < 9){ // [8,9,9,9]
             for(int i=digits.length -1; i >= 0; i--){
                 if(digits[i] < 9){
                     digits[i] += 1;
                     return digits;
                 }
                 digits[i] = 0;
             }
        }
        
        if(digits[0] == 9){
            for(int i=digits.length -1; i >= 0; i--){
                if(i>0){
                    if(digits[i] < 9){   // in case of [9,1,9]
                        digits[i] += 1;
                        return digits;
                    } else {
                        digits[i] = 0;
                    }
                }
                if(i==0){// [9,9,9,9]
                    int[] digits2 = new int[digits.length+1];
                    digits2[0] = 1;
                    return digits2;
                }
            }
        }
        
        return new int[1];
    }
}