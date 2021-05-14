public class Calculator {
    double a = 10;
    double b = 36;

    void sum() {
        double c;
        c = a + b;
        System.out.println("Tổng = " + c);
    }

    void sub() {
        double d;
        d = b - a;
        System.out.println("Hiệu = " + d);
    }
    double chia(){
        double e;
        e = b/a;
        return e;
    }
}
