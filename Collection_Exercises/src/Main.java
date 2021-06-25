import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>(List.of(
                new Person("Vinh", "Vietnam", 28),
                new Person("Lan", "Vietnam", 24),
                new Person("John", "USA", 27),
                new Person("Lee", "China", 67),
                new Person("Kim", "Korea", 22),
                new Person("Long", "Vietnam", 18),
                new Person("Jungho", "Korea", 19),
                new Person("Tian", "China", 20),
                new Person("Clara", "USA", 40),
                new Person("Mikura", "Japan", 27),
                new Person("Sony", "Japan", 29),
                new Person("Xiang", "China", 78),
                new Person("Peter", "France", 18),
                new Person("Haloy", "Malaysia", 20),
                new Person("Magie", "Malaysia", 32)
        ));

        //1.1 Đếm số người theo từng quốc tịch in ra màn hình
        System.out.println("1.1 Đếm số người theo từng quốc tịch in ra màn hình:");
        bai1(person);

        //1.2 Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình
        System.out.println("1.2 Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình:");
        bai2(person);

        //1.3 Tính trung bình tuổi của người theo từng quốc gia
        System.out.println("1.3 Tính trung bình tuổi của người theo từng quốc gia");
        bai3(person);

        //1.4 In ra màn hình đánh giá tuổi mỗi người
        System.out.println("1.4 In ra màn hình đánh giá tuổi mỗi người");
        bai4(person);
    }


    private static void bai1(List<Person> person) {
        Work work = new Work();
        List<String> nationaList = work.nationalityList(person); //Lấy danh sách các quốc gia cho vào 1 list
        for (String n : nationaList) {
            System.out.println("- " + n + ": " + work.countPerson(n, person)); //Với mỗi quốc gia gọi hàm lấy số lượng người của quốc gia đấy
        }
    }

    private static void bai2(List<Person> person) {
        Work work = new Work();
        List<Person> Person = work.sortByName(person); //Sắp xếp lại list person theo tên người
        for (Person p : Person) {
            if (p.age > 25) System.out.println(p); //Thằng nào tuổi lớn hơn 25 thì in ra
        }
    }

    private static void bai3(List<Person> person) {
        Work work = new Work();
        DecimalFormat fm = new DecimalFormat("#.#");
        List<String> nationaList = work.nationalityList(person);//Lấy danh sách các quốc gia cho vào 1 list
        for (String n : nationaList) {
            System.out.println("- " + n + " : " + fm.format(work.averageAge(n, person)));//Gọi hàm tính trung bình tuổi
        }
    }

    private static void bai4(List<Person> person) {
        Work work = new Work();
        for (Person p : person) {
            System.out.println(p + work.checkPerson(p));
        }
    }
}
