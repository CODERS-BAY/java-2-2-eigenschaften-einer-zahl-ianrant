import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scannedNumber = 0;
        int luckyNumber = (int) (Math.random()*10) * (int) (Math.random()*10);

        System.out.println("Pssst... my lucky number is "+luckyNumber);
        System.out.println("Please enter an integer:");
        scannedNumber = scanner.nextInt();

        boolean isRound = scannedNumber % 10 == 0;
        boolean isEven = scannedNumber % 2 == 0;
        boolean isLuckyNumber = scannedNumber == luckyNumber;
        boolean hasTwoDecimals = scannedNumber < 100 && scannedNumber > 10;

        System.out.println();

        String round = isRound ? "is round, " : "is not round, ";
        String even = isEven ? "is even, " : "is odd, ";
        String lucky = isLuckyNumber ? "equals your lucky number, " : "differs from your lucky number, ";
        String decimals = hasTwoDecimals ? "and is has two decimals." : "and it does not have two decimals.";

        System.out.print("The result are in: The number you entered ");
        System.out.print(round);
        System.out.print(even);
        System.out.print(lucky);
        System.out.print(decimals);
    }

}
