public class Main {
    int a = 10;

    public static void main(String[] args) {
        int b = 20;
        System.out.println("Hello world");
        Calculator calcu = new Calculator();
        calcu.sum();
        calcu.sub();
        double x = calcu.chia();
        System.out.println("Kết quả là " + x);
    }
}
