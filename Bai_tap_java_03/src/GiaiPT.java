import java.util.Scanner;

public class GiaiPT {
    static void pt_bac1(){
        double a, b;
        System.out.println("Nhập 2 số a, b của phương trình ax + b = 0 (a # 0)");
        System.out.print("a = ");
        a = new Scanner(System.in).nextInt();
        if(a==0)do {
            System.out.println("Vui lòng nhập số a # 0");
            System.out.print("a = ");
            a = new Scanner(System.in).nextInt();
        } while (a == 0);
        System.out.print("b = ");
        b = new Scanner(System.in).nextInt();
        System.out.printf("Nghiệm của phương trình %dx + %d = 0 là: x = %d",a,b,(-b/a));
    }
}
