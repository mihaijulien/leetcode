class Solution {
    public int tribonacci(int n) {
        if(n < 3){
            return n > 0 ? 1 : 0;
        }
        
        int[] dp = new int[n + 1];
        
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }
        
        return dp[n];
    }
}

class Solution {
    
    Map<Integer, Integer> memo = new HashMap<>();
    
    public int tribonacci(int n) {
        if(n < 3){
            return n > 0 ? 1 : 0;
        } else if(memo.containsKey(n)){
            return memo.get(n);
        } else {
            int result = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
            memo.put(n, result);
            return result;
        }
        
    }
}
