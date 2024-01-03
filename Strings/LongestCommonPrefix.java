class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }

        StringBuilder prefix = new StringBuilder(strs[0]);

        for(int i=1; i<strs.length; i++){

            int searchSize = Math.min(strs[i].length(), prefix.length());

            StringBuilder temp = new StringBuilder();

            for(int j=0; j<searchSize; j++){
                if(strs[i].charAt(j) != prefix.charAt(j)){
                    break;
                }
                temp.append(prefix.charAt(j));
            }
            prefix = temp;
        }

        return prefix.toString();
    }
}