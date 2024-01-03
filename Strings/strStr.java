class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0; i<=haystack.length() - needle.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                for(int j=0; j<needle.length(); j++){
                    if(needle.charAt(j) != haystack.charAt(i+j)) {
                        break;
                    }
                    if(j == needle.length() - 1) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}