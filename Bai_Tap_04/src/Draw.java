import java.util.Scanner;

public class Draw {
    static void Triangle() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("\nNhập chiều cao của tam giác n (n>0): ");
            n = scanner.nextInt();
            if (n <= 0) System.out.print("Hãy nhập số > 0");
        } while (n <= 0);
        System.out.println("Heigth = " + n);
        for (int i =1; i<=n; i++){
            int k = 0;
            while (k<n-i){
                System.out.print(" ");
                k++;
            }
            for (int j =0;j<(i*2-1) ;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Square() {
        Scanner scanner = new Scanner(System.in);
        int n,m;
        do {
            System.out.print("Nhập chiều cao của hình chữ nhật n (n>0): ");
            n = scanner.nextInt();
            if (n <= 0) System.out.print("Hãy nhập số > 0");
        } while (n <= 0);
        do {
            System.out.print("Nhập chiều ngang của hình chữ nhật m (m>0): ");
            m = scanner.nextInt();
            if (m <= 0) System.out.print("Hãy nhập số > 0");
        } while (m <= 0);
        System.out.println("\nHình chữ nhật có ");
        System.out.println("Chiều cao = " + n);
        System.out.println("Chiều ngang = " + m);
        for (int i =1; i<=n; i++){
            for (int j =0;j<m ;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
