public class Main {
    public static void main(String[] args) {
//        evenNumber();
//        Ex1();
//        loopNumber();
        check();
    }

    static void evenNumber() {
        int sum = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "\t");
                sum = sum + i;
            }
        }
        System.out.println("Sum = " + sum);
    }

    static void Ex1() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ": ");
//            if (i % 3 == 0) {
//                if (i % 5 == 0) {
//                    System.out.println(": FizzBuzz");
//                } else System.out.println(": Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println(": Buzz");
//            } else System.out.println("");
            if (i % 3 == 0) System.out.print("Fizz");
            if (i % 5 == 0) System.out.print("Buzz");
            System.out.println();
        }
    }

    static void loopNumber() {
        int i = 50;
        while (i >= 0) {
            if (i % 2 == 0) System.out.println(i);
            i--;
        }
    }

    static void check() {
        int  m =30 ;
        int n = 0;
        System.out.println("Danh sách "+ m +" số nguyên tố đầu tiên là: ");
        while (n <= m) {
            for (int i = 1; i <= n; i++) {
                int dem = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) dem++;
                }
                if (dem == 2) System.out.print(i + ", ");
            }
            n ++;
        }
    }
}
