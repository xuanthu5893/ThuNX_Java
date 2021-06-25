import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>(List.of(
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
        List<String> nationaList = nationalityList(people);
        for (String n : nationaList) {
            System.out.println("- " + n + ": " + count(n, people));
        }
        //1.2 Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình
        System.out.println("1.2 Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình:");
        ArrayList<Person> people1 = sortByName(people);
        for (Person p : people1) {
            if (p.age > 25) System.out.println(p);
        }

        //1.3 Tính trung bình tuổi của người theo từng quốc gia
        System.out.println("1.3 Tính trung bình tuổi của người theo từng quốc gia");
        DecimalFormat fm = new DecimalFormat("#.#");
        for (String n : nationaList) {
            float sumAge = (float) sumAge(n, people);
            int sumPeople = count(n, people);
            System.out.println("- " + n + " : " + fm.format(sumAge / sumPeople));

        }

        //1.4 In ra màn hình đánh giá tuổi mỗi người
        System.out.println("1.4 In ra màn hình đánh giá tuổi mỗi người");
        for (Person p : people) {
            if (p.age < 20) {
                System.out.println(p + " - nổi loạn");
            } else if (p.age < 30) {
                System.out.println(p + " - việc làm");
            } else if (p.age < 40) {
                System.out.println(p + " - sự nghiệp");
            } else System.out.println(p + " - hưởng thụ");
        }

    }

    private static int count(String nationality, ArrayList<Person> person) {
        int count = 0;
        for (Person p : person) {
            if (p.nationality.equals(nationality)) count++;
        }
        return count;
    }

    private static List nationalityList(ArrayList<Person> person) {
        List<String> list = new ArrayList<String>();
        for (Person p : person) {
            if (!list.contains(p.nationality)) list.add(p.nationality);
        }
        return list;
    }

    private static ArrayList sortByName(ArrayList<Person> person) {
        ArrayList<Person> list = new ArrayList<>();
        for (Person p : person) {
            int size = list.size();
            if (list.size() == 0) list.add(p);
            else for (int i = 0; i < size; i++) {
                if (p.name.compareTo(list.get(i).name) < 0) {
                    list.add(i, p);
                    break;
                } else if (i == size - 1) {
                    list.add(p);
                }
            }
        }
        return list;
    }

    private static int sumAge(String nationality, ArrayList<Person> person) {
        int sum = 0;
        for (Person p : person) {
            if (p.nationality.equals(nationality)) sum = sum + p.age;
        }
        return sum;
    }

}
