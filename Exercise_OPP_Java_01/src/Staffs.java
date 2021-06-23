public class Staffs extends Peoples {
    public String type;

    public Staffs(String name, int age, String gender, String address, String type) {
        super(name, age, gender, address);
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nNhân viên: " +
                "\nTên: " + name +
                "\nTuổi: " + age +
                "\nGiới tính: " + gender +
                "\nĐịa chỉ: " + address +
                "\nChức vụ: " + type ;
    }
    public void tat_den(){
        System.out.println("Đi tắt điện");
    }
}
