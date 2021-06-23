public class Main {
    public static void main(String[] args) {
        VinSchool();
    }

    public static void VinSchool() {
        Students student_1 = new Students("Thu", 28, "Nam", "Thái Bình", "Đang học");
        System.out.println(student_1);
        student_1.doExercise();
        Lecturers lecturer_1 = new Lecturers("Anh", 30, "Nữ", "Hà Nội", "Full time");
        System.out.println(lecturer_1);
        lecturer_1.action();
        Staffs staff_1 = new Staffs("Hùng", 20, "Nam", "Nghệ An", "bảo vệ");
        System.out.println(staff_1);
        staff_1.tat_den();
    }
}
