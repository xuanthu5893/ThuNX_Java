import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercises_02 {
    static void password() {
        Scanner scanner = new Scanner(System.in);
        String password = "";
        boolean check = false;
        Pattern letter = Pattern.compile("[A-Z]");
        Pattern digit = Pattern.compile("[0-9]");
        Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");

        while (check == false) {
            System.out.print("Nhập mật khẩu muốn tạo: ");
            password = scanner.nextLine();
            Matcher hasLetter = letter.matcher(password);
            Matcher hasDigit = digit.matcher(password);
            Matcher hasSpecial = special.matcher(password);
            if (password.length() < 10) {
                System.out.println("Mật khẩu yếu, vui lòng tạo mật khẩu khác");

            } else if (hasLetter.find() == false || hasDigit.find() == false || hasSpecial.find() == false) {
                System.out.println("Mật khẩu chưa đủ đủ mạnh, vui lòng tạo mật khẩu khác");

            } else check = true;
        }
        System.out.println("Tạo mật khẩu thành công!");
    }
}
