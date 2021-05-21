import java.util.Scanner;

public class Mang2Chieu {
    static void CreateMang(int n, int m, int arr[][]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập giá trị cho phần tử vị trí " + i + " " + j + ": ");
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    static void ShowMang(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void CongMang(int arr1[][], int arr2[][]) {
        int n = arr1.length;
        int m = arr1[0].length;
        int[][] arrSum = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrSum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Mảng tổng là: ");
        ShowMang(arrSum);
    }

    static void showduongcheo(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int sum = 0;
        System.out.print("Các phần tử nằm trên đường chéo chính là: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + "(" + i + "," + j + ")   ");
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("\nTổng các phần tử trên đường chéo chính là: " + sum);
    }

    static void sapxepmang(int arr[][]) {
        if (arr.length < 2) System.out.println("Mảng có ít hơn 2 hàng");
        else {
            int arr2[] = arr[1];
            int swap;
            //sắp xếp lại hàng 2
            for (int i = 0; i < arr2.length - 1; i++) {
                for (int j = i + 1; j < arr2.length; j++) {
                    if (arr2[i] > arr2[j]) {
                        swap = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = swap;
                    }
                }
            }
            //gán giá trị sau khi sắp xếp vào mảng 1
            for (int i = 0; i < arr2.length; i++) {
                arr[1][i] = arr2[i];
            }
            ShowMang(arr);
        }

    }
}
