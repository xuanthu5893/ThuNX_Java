import static java.lang.Math.sqrt;

public class PrimeNumber {
    static boolean checkPrime(double n) {
        if (n < 2) return false;
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static void phanTach(int n) {
        int i = 2;
        System.out.printf("Số %d được phân tách thành: ", n);
        while (i > 0) {
            if (n % i == 0) {
                n = n / i;
                System.out.print( i + " x ");
            } else i++;
        }

    }
}
