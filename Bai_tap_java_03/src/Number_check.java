public class Number_check {
    static void check(int n){
        if(n>=0) System.out.println(n+ " là số nguyên dương");
        else System.out.println(n + " là số nguyên âm");
    }
    static void printNumber(int n){
        System.out.printf("Các số chia hết cho 3 từ 0 đến %d là: ", n);
        for (int i =0; i <=n; i++){
            if (i%3==0) System.out.print(i + " ");
        }
    }
}
