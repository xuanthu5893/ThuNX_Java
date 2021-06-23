public class Lecturers extends Peoples {
    public String role;

    public Lecturers(String name, int age, String gender, String address, String role) {
        super(name, age, gender, address);
        this.role = role;
    }

    @Override
    public String toString() {
        return "\nGiảng viên: " +
                "\nTên: " + name +
                "\nTuổi: " + age +
                "\nGiới tính: " + gender +
                "\nĐịa chỉ: " + address +
                "\nLoại hợp đồng: " + role;
    }
    public void action(){
        System.out.println("Chấm bài tập");
    }
}
