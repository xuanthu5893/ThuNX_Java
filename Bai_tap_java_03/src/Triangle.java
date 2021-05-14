import java.util.Scanner;

public class Triangle {
    int a, b, c;

    void check() {
        System.out.println("Nhập 3 số a, b, c");
        System.out.print("a = ");
        a = new Scanner(System.in).nextInt();
        System.out.print("b = ");
        b = new Scanner(System.in).nextInt();
        System.out.print("c = ");
        c = new Scanner(System.in).nextInt();
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            if (a == b && b == c) System.out.println("a, b, c là 3 cạnh của 1 tam giác đều");
            else if (a == b || a == c || b == c) System.out.println("a, b, c là 3 cạnh của 1 tam giác cân");
            else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
                System.out.println("a, b, c là 3 cạnh của 1 tam giác vuông");
            else System.out.println("a, b, c là 3 cạnh của 1 tam giác thường");
        } else System.out.println("a, b, c không phải là 3 cạnh của 1 tam giác");
    }
}
