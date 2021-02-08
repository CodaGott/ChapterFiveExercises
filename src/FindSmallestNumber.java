import java.util.Scanner;

public class FindSmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loopCounter;
        int smallestNumber;
        int tempHolder;
        System.out.println("How many times do you want this loop to run?");
        loopCounter = scanner.nextInt();
        System.out.println("Enter a number");
        smallestNumber = scanner.nextInt();

        for (int input = 1; input <= loopCounter; input++) {
            System.out.println("Enter numbers ");
            tempHolder = scanner.nextInt();
           if (smallestNumber > tempHolder){
               smallestNumber = tempHolder;
           }
        }
        System.out.println("Smallest num " + smallestNumber);
    }
}
