import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String name = "Nguyen Xuan Thu a";
        String str1 = "Test";
        String str2 = new String("Test");

        System.out.println("Upper Case: " + name.toUpperCase());
        System.out.println("Lower Case: " + name.toLowerCase());
        int size = name.length();
        System.out.println("Kích thước chuỗi: " + size);
        System.out.println("So sánh 2 chuỗi: " + name.equals(str1) );
        System.out.println("So sánh 2 chuỗi: " + str1==str2 );
        System.out.println("Vị trí của a: " + name.indexOf("T"));
        System.out.println("Ký tự có index = 7: " + name.charAt(7));
        System.out.println("Thay thế chuỗi: " + name.replace(" ", "_"));
        System.out.println("Lấy tên: " + name.substring(12));

    }
}
