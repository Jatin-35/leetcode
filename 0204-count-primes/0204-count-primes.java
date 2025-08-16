class Solution {
    public int countPrimes(int n) {
        if (n < 3) return 0; // only prime < 3 is 2

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        int count = n / 2; // assume half numbers are prime (all odds), adjust later

        for (int i = 3; i * i < n; i += 2) { // skip evens
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += 2 * i) { // skip even multiples
                    if (isPrime[j]) {
                        isPrime[j] = false;
                        count--;
                    }
                }
            }
        }

        return count;
    }
}
