public class ModifiedInterest {
    public static void main(String[] args) {
        double amount;
        double principal = 1000;
        double rate = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount on Deposit");
        for (int year = 1; year <= 10; ++year){
            for (rate = 0.05; rate <= 0.10; rate+=0.01) {
                amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,20.2f%n", year, amount);
            }
        }
    }
}
