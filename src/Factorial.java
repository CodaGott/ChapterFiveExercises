public class Factorial {
    public static void main(String[] args) {
        int total = 1;
        for (long factorial = 20; factorial >=1; factorial -=1){
            System.out.println(factorial);
            total *= factorial;
        }
        System.out.println(total);
    }
}
