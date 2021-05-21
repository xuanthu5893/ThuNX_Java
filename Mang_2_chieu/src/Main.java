import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Bài 1");
        System.out.print("Nhập số hàng, cột của ma trận vuông: ");
        n = scanner.nextInt();
        int m = n;
        Mang2Chieu mang = new Mang2Chieu();
        System.out.println("Nhập giá trị cho ma trận");
        int[][] mangA = new int[n][m];
        mang.CreateMang(n, m, mangA);
        System.out.println("Ma trận: ");
        mang.ShowMang(mangA);
        mang.showduongcheo(mangA);
        System.out.println("Mảng sau khi sắp xếp hàng 2 theo thứ tự tăng dần: ");
        mang.sapxepmang(mangA);

        System.out.println("Bài 2");
        System.out.print("Nhập số phần tử: ");
        n = scanner.nextInt();
        int mang1c[] = new int[n];
        Mang1Chieu mang1Chieu = new Mang1Chieu();
        mang1Chieu.nhap(mang1c);
        mang1Chieu.showmang(mang1c);
        mang1Chieu.showPrime(mang1c);
        mang1Chieu.update(mang1c);
    }
}
