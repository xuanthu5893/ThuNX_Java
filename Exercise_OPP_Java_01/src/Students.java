public class Students extends Peoples {
    public String status;

    public Students(String name, int age, String gender, String address, String status) {
        super(name, age, gender, address);
        this.status = status;
    }

    @Override
    public String toString() {
        return "\nStudent:" +
                "\nTên: " + name +
                "\nTuổi: " + age +
                "\nGiới tính: " + gender +
                "\nĐịa chỉ: " + address +
                "\nTrạng thái = " + status;
    }
    public void doExercise(){
        System.out.println("làm bài tập");
    }
}
