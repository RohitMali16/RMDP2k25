public class DivisorCount {
    public static int countDivisors(int n) {
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    count++; 
                } else {
                    count += 2; 
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int N = 12;
        System.out.println("Number of divisors of " + N + " = " + countDivisors(N));
    }
}
