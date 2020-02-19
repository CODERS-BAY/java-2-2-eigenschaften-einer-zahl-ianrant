import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scannedNumber = 0;
        int luckyNumber = (int) (Math.random()*10) * (int) (Math.random()*10);

        boolean isRound = false;
        boolean isEven = false;
        boolean isLuckyNumber = false;
        boolean hasTwoDecimals = false;

        System.out.println("Pssst... my lucky number is "+luckyNumber);
        System.out.println("Please enter an integer:");
        scannedNumber = scanner.nextInt();

        System.out.println();
        if (scannedNumber % 10 == 0) {
            isRound = true;
        }

        if (scannedNumber % 2 == 0) {
            isEven = true;
        }

        if (scannedNumber == luckyNumber) {
            isLuckyNumber = true;
        }

        if (scannedNumber < 100 && scannedNumber > 10) {
            hasTwoDecimals = true;
        }

        String round = (isRound == true) ? "is round, " : "is not round, ";
        String even = (isEven == true) ? "is even, " : "is odd, ";
        String lucky = (isLuckyNumber == true) ? "equals your lucky number, " : "differs from your lucky number, ";
        String decimals = (hasTwoDecimals == true) ? "and is has two decimals." : "and it does not have two decimals.";

        System.out.print("The result are in: The number you entered ");
        System.out.print(round);
        System.out.print(even);
        System.out.print(lucky);
        System.out.print(decimals);
    }

}
