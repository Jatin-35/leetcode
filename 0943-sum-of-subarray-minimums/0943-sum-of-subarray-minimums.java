class Solution {
    public int sumSubarrayMins(int[] arr) {
        
        int n = arr.length;

        List<Integer> nse = new ArrayList<>();
        nse = nse(arr);

        List<Integer> psee = new ArrayList<>();
        psee = psee(arr);

        long total = 0;
        int mod = (int)Math.pow(10, 9) + 7;

        for(int i = 0; i < n; i++){

            int left = i - psee.get(i);
            int right = nse.get(i) - i;

            total = (total + (1L * right * left % mod * arr[i] % mod)) % mod; 

        }

        return (int)total;
    }

    private List<Integer> nse(int[] arr) {
        int n = arr.length;
        List<Integer> res = new ArrayList<>(Collections.nCopies(n, n)); // Default NSE is n
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                res.set(stack.pop(), i);
            }
            stack.push(i);
        }

        return res;
    }

    private List<Integer> psee(int[] arr) {
        int n = arr.length;
        List<Integer> res = new ArrayList<>(Collections.nCopies(n, -1)); // Default PSEE is -1
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                res.set(stack.pop(), i);
            }
            stack.push(i);
        }

        return res;
    }
}