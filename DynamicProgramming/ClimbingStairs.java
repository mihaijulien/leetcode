class Solution {
    public int climbStairs(int n) {
        if (n == 1 || n == 0){
            return 1;
        }
        
        return climbStairs(n-1) + climbStairs(n - 2);
    }
}

class Solution {
    
    Map<Integer, Integer> steps = new HashMap<>();
    
    public int climbStairs(int n) {

        if(steps.containsKey(n)){
            return steps.get(n);
        }
        
        if(n == 0 || n == 1){
            return 1;
        }
        
        steps.put(n, climbStairs(n-1) + climbStairs(n-2));
        
        return steps.get(n);
    }    
}