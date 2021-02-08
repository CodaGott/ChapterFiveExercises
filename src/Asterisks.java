public class Asterisks {
    public static void main(String[] args) {
        for (int asteriskCounter = 1; asteriskCounter <= 10; asteriskCounter++){
            for (int asteriskPrint = 1; asteriskPrint<= asteriskCounter; asteriskPrint++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int asteriskCounter = 10; asteriskCounter >=1; asteriskCounter--){
            for (int asteriskPrint = 1; asteriskPrint <= asteriskCounter; asteriskPrint++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int asteriskCounter = 10; asteriskCounter >=1; asteriskCounter--){
            for(int asteriskSpacer = 10; asteriskSpacer>= asteriskCounter; asteriskSpacer--){
                System.out.print(' ');
            }
            for (int asteriskPrint = 1; asteriskPrint <= asteriskCounter; asteriskPrint++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int asteriskCounter = 1; asteriskCounter <= 10; asteriskCounter++) {
            for(int asteriskSpacer = 1; asteriskSpacer<= asteriskCounter; asteriskSpacer++){
                System.out.print(' ');
            }
            for (int asteriskPrint = 1; asteriskPrint <= asteriskCounter; asteriskPrint++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
