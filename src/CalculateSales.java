import java.util.Scanner;

/* (Calculating Sales) An online retailer sells five products whose retail prices are as follows:
Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
Write an application that reads a series of pairs of numbers as follows:
a) product number
b) quantity sold
Your program should use a switch statement to determine the retail price for each product. It
should calculate and display the total retail value of all products sold. Use a sentinel-controlled
loop to determine when the program should stop looping and display the final results. */

public class CalculateSales {

    private static double productPrice;
    private int productNumber;
    private int quantitySold;
    private static double sales;


    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public void calculateSales(int productNumber, int quantity) {
        setProductPrice(productNumber);
        sales = getProductPrice() * quantity;

    }

    public double getSales(){
        return sales;
    }

    private void setProductPrice(int productNumber) {

        switch (productNumber) {
            case 1 -> productPrice = 2.98;
            case 2 -> productPrice = 4.50;
            case 3 -> productPrice = 9.98;
            case 4 -> productPrice = 4.49;
            case 5 -> productPrice = 6.87;
            default -> productPrice = 0;
        }
    }

    private double getProductPrice(){
        return productPrice;
    }
}


class testMain{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CalculateSales sales = new CalculateSales();



        System.out.println("Enter product number");
        int productNumber = scanner.nextInt();
        sales.setProductNumber(productNumber);
        double totalPrice = 0;


        while(sales.getProductNumber() > 0 && sales.getProductNumber() <= 5){

            System.out.println("enter quantity");
            int quantity = scanner.nextInt();
            sales.setQuantitySold(quantity);

            sales.calculateSales(sales.getProductNumber(), sales.getQuantitySold());

            System.out.println("Enter product number");
            productNumber = scanner.nextInt();
            sales.setProductNumber(productNumber);

            totalPrice =totalPrice + sales.getSales();
        }

        System.out.println("quantity sold is: " + sales.getQuantitySold());
        System.out.println("total amount of the product is: " + totalPrice);

    }


}
