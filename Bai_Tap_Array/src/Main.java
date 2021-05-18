import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            m = scanner.nextInt();
            arr[i] = m;
        }
        System.out.print("\nCác phần tử trong mảng là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int max1, max2, min;
        /*
        Nếu có 1 số >= max1:
        max2 = max1;
        max1 = số lớn nhất mới tìm được
        Nếu có 1 số chỉ > max2:
        max2 = số lớn hơn mới tìm được
         */
        int index1, index2;
        if (arr[0] >= arr[1]) {
            max1 = arr[0];
            index1 = 1;
            max2 = arr[1];
            index2 = 2;
        } else {
            max2 = arr[0];
            index2 = 1;
            max1 = arr[1];
            index1 = 2;
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                index2 = index1;
                max1 = arr[i];
                index1 = i + 1;
            } else {
                if (arr[i]>max2){
                    max2 = arr[i];
                    index2 = i+1;
                }
            }
        }
        System.out.printf("\nPhần tử lớn nhất là %d, nằm ở vị trí thứ %d", max1, index1);
        System.out.printf("\nPhần tử lớn thứ 2 là %d, nằm ở vị trí thứ %d", max2, index2);

        int index =1;
        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i + 1;
            }
        }
        System.out.printf("\nPhần tử nhỏ nhất là %d, nằm ở vị trí thứ %d", min, index);
    }
}
