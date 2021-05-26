import java.util.Scanner;

public class Number {
    static void sum1() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("\nNhập số nguyên dương n (n>0): ");
            n = scanner.nextInt();
            if (n <= 0) System.out.print("Hãy nhập số > 0");
        } while (n <= 0);
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i * i;
        }
        System.out.println("Tổng S(n) = 1^2 + 2^2 + ...+ n^2 = " + sum);
    }


    static void sum2() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("\nNhập số nguyên dương n (n>0): ");
            n = scanner.nextInt();
            if (n <= 0) System.out.print("Hãy nhập số > 0");
        } while (n <= 0);
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0 / i;
        }
        System.out.println("Tổng S(n) = 1 + 1/2 +…+ 1/n = " + sum);
    }

    static void sum3() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("\nNhập số nguyên dương n (n>0): ");
            n = scanner.nextInt();
            if (n <= 0) System.out.print("Hãy nhập số > 0");
        } while (n <= 0);
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + (2.0*i +1 ) /(2.0*i +2);
        }
        System.out.println("Tổng S(n) =  1/2 + 3/4 + 5/6 +…+ (2n + 1)/(2n + 2) = " + sum);
    }

    static void convert() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("\nNhập số nguyên dương n (n>0): ");
            n = scanner.nextInt();
            if (n <= 0) System.out.print("Hãy nhập số > 0");
        } while (n <= 0);
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + (2.0*i +1 ) /(2.0*i +2);
        }
        System.out.println("Tổng S(n) =  1/2 + 3/4 + 5/6 +…+ (2n + 1)/(2n + 2) = " + sum);
    }

}
