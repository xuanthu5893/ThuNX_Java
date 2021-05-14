public class Main {
    public static void main(String[] args) {
        double weight  = 50;
        double height = 1.62;
        double bmi;
        bmi = weight /(height*height);
        System.out.println("Cân nặng của bạn là: " + weight + " kg");
        System.out.println("Chiều cao của bạn là: " + height +" m");
        System.out.println("Chỉ số BMI của bạn là: " + bmi);
        if(bmi>=18.5){
            if(bmi>24.9){
                System.out.println("Bạn bị béo phì cmnr =)))");
            } else System.out.println("Bạn đẹp zai vồn!!!!");
        }else System.out.println("Bạn gầy vãi =)))");
    }
}
