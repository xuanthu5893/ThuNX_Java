import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            m = scanner.nextInt();
            arr[i] = m;
        }

        System.out.print("\nCác phần tử trong mảng là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nPhần tử thứ 2 trong mảng là: " + arr[1]);


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Tổng các phần tử trong mảng là: " + sum);

        System.out.print("Các phần tử chẵn trong mảng là: ");
        int tong_chan = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                tong_chan = tong_chan + arr[i];
            }
        }
        System.out.println("\nTổng các phần tử chẵn trong mảng là: " + tong_chan);

        int swap;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        System.out.print("\nMảng sau khi sắp xếp tăng dần là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        System.out.print("\nMảng sau khi sắp xếp giảm dần là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
