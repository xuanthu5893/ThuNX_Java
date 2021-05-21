import java.util.Scanner;

public class Mang1Chieu {
    static void nhap(int arr[]) {
        int m;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            m = scanner.nextInt();
            arr[i] = m;
        }
    }

    static void showmang(int arr[]) {
        System.out.println("Show mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void showPrime(int arr[]) {
        PrimeNumber primeNumber = new PrimeNumber();
        int sum = 0;
        int check = 0;
        String out = "";

        for (int i = 0; i < arr.length; i++) {
            if (primeNumber.checkPrime(arr[i])) {
                out = out + arr[i] + " ";
                check++;
                sum += arr[i];
            }
        }
        if (check > 0) {
            System.out.println("\nCác phần tử là số nguyên tố là: " + out);
            System.out.println("Tổng các phần tử là số nguyên tố: " + sum);
        } else System.out.println("\nKhông có số nguyên tố nào trong mảng");

    }

    static void update(int arr[]) {
        int n = 0, m;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập vị trí muốn chỉnh sửa: ");
            n = scanner.nextInt();
            if (n < 1 || n > arr.length) System.out.println("Không tồn tại phần tử có vị trí " + n);
        } while (n<1 || n > arr.length);

        n = n - 1;
        System.out.println("Giá trị hiện tại: " + arr[n]);
        System.out.print("Nhập giá trị muốn thay đổi: ");
        m = scanner.nextInt();
        arr[n] = m;
        System.out.println("Updated");
        showmang(arr);
    }
}
