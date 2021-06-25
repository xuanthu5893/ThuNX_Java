
import java.util.ArrayList;
import java.util.List;

public class Work {

    //Đếm số người cho 1 quốc gia
    public int countPerson(String nationality, List<Person> person) {
        int count = 0;
        for (Person p : person) {
            if (p.nationality.equals(nationality)) count++;
        }
        return count;
    }

    //Lấy danh sách các quốc gia cho vào 1 list
    public List nationalityList(List<Person> person) {
        List<String> list = new ArrayList<String>();
        for (Person p : person) {
            if (!list.contains(p.nationality)) list.add(p.nationality);
        }
        return list;
    }

    //Sắp xếp list theo tên người
    public List sortByName(List<Person> person) {
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

    //Tính trung bình tuổi của 1 quốc gia
    public float averageAge(String nationality, List<Person> person) {
        int sum = 0;
        for (Person p : person) {
            if (p.nationality.equals(nationality)) sum = sum + p.age;
        }
        int countPerson = countPerson(nationality, person);
        float avgAge = (float) sum / countPerson;
        return avgAge;
    }

    public String checkPerson(Person person) {
        String value = "";
        if (person.age < 20) {
            value = " - nổi loạn";
        } else if (person.age < 30) {
            value = " - việc làm";
        } else if (person.age < 40) {
            value = " - sự nghiệp";
        } else value = " - hưởng thụ";
        return value;
    }

}
