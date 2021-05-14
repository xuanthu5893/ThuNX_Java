public class Main {
    public static void main(String[] args) {
//      Bài 1
        Rectangle rec = new Rectangle();
        rec.Perimeter();
        rec.Area();

//      Bài 2
        Circle cir = new Circle();
        double per = cir.Perimeter();
        System.out.println("Chu vi hình tròn là: " + per);
        double area = cir.Area();
        System.out.println("Diện tích hình tròn là: " + area);
    }
}
