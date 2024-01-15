/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int middle;
        int first = 1;
        int last = n;
        while(first <= last){
            
            middle = first + (last - first) / 2;
            
            if(isBadVersion(middle)){
                last = middle - 1;  
            } else {
                first = middle+1;
            }
        }
        
        return first;
    }
}