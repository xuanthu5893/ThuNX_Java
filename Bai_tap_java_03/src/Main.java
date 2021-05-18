import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 1;
        Scanner scanner = new Scanner(System.in);
        while (n != 0) {
            System.out.print("\nNhập bài tập muốn kiếm tra (1-15), nhập 0 để kết thúc: ");
            n = scanner.nextInt();
            switch (n) {
                case 0:
                    System.out.println("Bye!!!!!!");
                    break;
                case 1:
                    Ex1();
                    break;
                case 2:
                    Ex2();
                    break;
                case 3:
                    Ex3();
                    break;
                case 4:
                    Ex4();
                    break;
                case 5:
                    Ex5();
                    break;
                case 6:
                    Ex6();
                    break;
                case 7:
                    Ex7();
                    break;
                case 8:
                    Ex8();
                    break;
                case 9:
                    Ex9();
                    break;
                case 10:
                    Ex10();
                    break;
                case 11:
                    Ex11();
                    break;
                case 12:
                    Ex12();
                    break;
                case 13:
                    Ex13();
                    break;
                case 14:
                    Ex14();
                    break;
                case 15:
                    Ex15();
                    break;
                default:
                    System.out.println("Có 15 bài thôi nha, lại đi!");
                    break;
            }
        }

    }

    static void Ex1() {
        System.out.println("Bài tập số 1: ");
        PrimeNumber bt1 = new PrimeNumber();
        int dem = 1;
        int n, m = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số các số nguyên tố đầu tiên muốn hiển thị: ");
        n = scanner.nextInt();
        System.out.print(n + " số nguyên tố đầu tiên là: ");
        while (dem <= n) {
            if (bt1.checkPrime(m)) {
                System.out.print(m + " ");
                dem++;
            }
            m++;
        }

        System.out.println("\n\nCác số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 0; i < 100; i++) {
            if (bt1.checkPrime(i)) System.out.print(i + " ");
        }
    }

    static void Ex2() {
        System.out.println("\nBài 2");
        int n;
        Scanner scanner = new Scanner(System.in);
        FibonacciNumber fiNumber = new FibonacciNumber();
        System.out.print("Nhập số các số fibonacci đầu tiên muốn hiển thị: ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fiNumber.checkFibonacci(i) + " ");
        }
        System.out.println("\n\nCác số fibonacci nhỏ hơn 100 là: ");
        int demfFibo = 0;
        int fiboNumber = 0;
        do {
            fiboNumber = fiNumber.checkFibonacci(demfFibo);
            demfFibo++;
            if (fiboNumber < 100) System.out.print(fiboNumber + " ");
        } while (fiboNumber < 100);
    }

    static void Ex3() {
        System.out.println("Bài 3");
        int n = 1;
        double a;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số n (n # 0): ");
            n = scanner.nextInt();
        } while (n == 0);
        Factorial factorial = new Factorial();
        System.out.println(n + "! = " + factorial.getfactorial(n));
    }

    static void Ex4() {
        System.out.println("Bài 4");
        int n;
        n = new Random().nextInt(30);
        System.out.println("Số random: " + n);
        PrimeNumber check = new PrimeNumber();
        if (check.checkPrime(n)) System.out.println(n + " là số nguyên tố.");
        else System.out.println(n + " không phải là số nguyên tố.");
        Factorial factorial = new Factorial();
        System.out.println(n + "! = " + factorial.getfactorial(n));

    }

    static void Ex5() {
        System.out.println("\nBài 5");
        String str = "You only live once, but if you do it right, once is enough";
        System.out.println(str);
        int m, n = 0, check = 0;
        String text = "";
        while (n >= 0 && n < str.length()) {
            m = str.indexOf('o', n);
            if (m == -1) {
                n = m;
            } else {
                text = text + m + ", ";
                n = m + 1;
                check += 1;
            }
        }
        if (check > 0) System.out.println("Ký tự \"o\" nằm ở các vị trí là: " + text);
        else System.out.println("Không có ký tự o trong chuỗi");
    }

    static void Ex6() {
        System.out.println("\nBài 6");
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bảng cửu chương muốn hiển thị: ");
        n = scanner.nextInt();
        System.out.printf("Bảng cửu chương %d : \n", n);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d \n", n, i, n * i);
        }
    }

    static void Ex7() {
        System.out.println("\nBài 7");
        Triangle triangle = new Triangle();
        triangle.check();
    }

    static void Ex8() {
        System.out.println("\nBài 8");
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        s = scanner.nextLine();
        WordsEx wordsEx = new WordsEx();
        int i = wordsEx.countWord(s);
        System.out.println("Số từ trong chuỗi nhập vào là: " + i);

    }

    static void Ex9() {
        System.out.println("\nBài 9");
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        s = scanner.nextLine();
        WordsEx wordsEx = new WordsEx();
        int i = wordsEx.count2(s);
        System.out.println("Số từ trong chuỗi nhập vào là: " + i);
    }

    static void Ex10() {
        System.out.println("\nBài 10");
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        n = scanner.nextInt();
        Number_check number_check = new Number_check();
        int i = number_check.totaldigitNumber(n);
        System.out.println("Tổng các chữ số của số nguyên " + n + " là: " + i);
    }

    static void Ex11() {
        System.out.println("\nBài 11");
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        n = scanner.nextInt();
        PrimeNumber pn = new PrimeNumber();
        pn.phanTach(n);
    }

    static void Ex12() {
        System.out.println("\nBài 12");
        GiaiPT pt = new GiaiPT();
        pt.pt_bac1();
    }

    static void Ex13() {
        System.out.println("\nBài 13");
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        n = scanner.nextInt();
        Number_check check = new Number_check();
        check.printNumber(n);
    }

    static void Ex14() {
        System.out.println("\nBài 14");
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        n = scanner.nextInt();
        Number_check check = new Number_check();
        check.check(n);
    }

    static void Ex15() {
        System.out.println("\nBài 15");
        String str = "You only live once, but if you do it right, once is enough";
        System.out.println(str);
        int m, n = 0, check = 0;
        while (n >= 0 && n < str.length()) {
            m = str.indexOf('o', n);
            if (m == -1) {
                n = m;
            } else {
                n = m + 1;
                check += 1;
            }
        }
        if (check > 0) System.out.printf("Có %d ký tự \"o\" trong chuỗi\n", check);
        else System.out.println("Không có ký tự o trong chuỗi");
    }
}
