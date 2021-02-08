public class ProductsOfOddIntergers {
    public static void main(String[] args) {
        int total = 1;

        for (int oddNumbers = 1; oddNumbers <= 15; oddNumbers += 2){
            System.out.println(oddNumbers);
            total *= oddNumbers;
        }
        System.out.println("Total is " +total);
    }
}
