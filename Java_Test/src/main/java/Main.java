import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MonthCheckingException {
        int n = 1;
        Scanner scanner = new Scanner(System.in);
        while (n != 0) {
            System.out.print("\nNhập bài tập muốn kiếm tra, nhập 0 để kết thúc: ");
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
                default:
                    System.out.println("Có 3 bài thôi nha, lại đi!");
                    break;
            }
        }

    }

    private static void Ex1() {
        System.out.println("Bài tập số 1: ");
        String str = "You Only Live Once. But if You do it right. once is Enough";
        System.out.println(str);
        Exercises_01 ex_01 = new Exercises_01();
        int count = ex_01.count(str);
        System.out.println("Chuỗi trên có " + count + " ký tự in hoa");
        String str2 = "";
        str2 = ex_01.Uppercase(str);
        System.out.println("Chuỗi viết hoa toàn bộ chữ cái đầu: \n" + str2);
        String str3 = "";
        str3 = ex_01.Uppercase2(str);
        System.out.println("Chuỗi viết hoa chữ cái đầu hoặc sau dấu chấm: \n" + str3);
    }
    private static void Ex2() {
        System.out.println("Bài tập số 2: ");
        Exercises_02 ex_02 = new Exercises_02();
        ex_02.password();
    }

    private static void Ex3() throws MonthCheckingException {
        System.out.println("Bài 3.");
        System.out.print("Nhập tháng: ");
        try {
            int t = (new Scanner(System.in)).nextInt();
            Exercises_03 ex_03 = new Exercises_03();
            ex_03.CheckMonth(t);
            if (t<1 || 12<t) throw new ArithmeticException("Không phải tháng.");
        }catch(InputMismatchException ex1){
            throw new MonthCheckingException("Tháng phải nhập số vào. ");
        }
    }
}
