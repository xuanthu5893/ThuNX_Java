import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bai2();
    }

    static void bai2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();
        String str2 = String.valueOf(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            int dem = 0;
            int j = 0;
            while (dem == 0 && j < str2.length()) {
                if (str.charAt(i) == str2.charAt(j)) {
                    dem++;
                }
                j++;
            }

            if (dem == 0) {
                str2 = str2.concat(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println("Chuỗi sau khi xóa bỏ ký tự bị trùng: " + str2);
    }
}
