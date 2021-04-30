public class CountPrimes_204 {
    /**
     *
     * Count the number of prime numbers less than a non-negative number, n.
     *

     * Example 1:
     *
     * Input: n = 10
     * Output: 4
     * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
     * Example 2:
     *
     * Input: n = 0
     * Output: 0
     * Example 3:
     *
     * Input: n = 1
     * Output: 0
     *
     *
     * Constraints:
     *
     * 0 <= n <= 5 * 106
     *
     */
    public int countPrimes(int n) {
        if(n < 3) return 0;

        boolean[] nonPrimesList=new boolean[n];
        int nonPrimesCounter = 0;

        for(int i=2; i <= (int) Math.sqrt(n); ++i){
            if(!nonPrimesList[i]){
                for(int j = i*i ; j < n ; j+=i){
                    if(!nonPrimesList[j])
                        nonPrimesCounter ++;
                    nonPrimesList[j] = true;
                }
            }
        }

        return n - nonPrimesCounter - 2;
    }
}