import MyMath.Vector;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Class");
        demoPerson();
        demoMyMath();
    }
    public static void demoPerson(){
        Persion persion = new Persion();
        persion.firstname = "Bill";
        persion.lastName = "Gates";
        persion.birthday = LocalDate.of(2011,11,11);
        System.out.println(persion);
    }
    public static void demoMyMath(){
        Vector vector = new Vector(3,4);
        System.out.println(vector);
    }
}
