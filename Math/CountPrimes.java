class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        
        for(int i=2; i<= Math.sqrt(n); i++){
            if(isPrime[i]){
                for(int j=2; j * i <n; j++){
                    isPrime[j * i] = false;
                }
            }
        }
        
        int primeCounter = 0;
        
        for(int i=2; i<n; i++){
            if(isPrime[i]){
                primeCounter++;
            }
        }
        
        return primeCounter;
    }
}
