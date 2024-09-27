import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //STATIC VARIABLES
        final int PERCENT = 100;
        final int MONTHS = 12;

        //USER INPUT
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: $");
        double principal = scanner.nextDouble();

        System.out.print("Interest rate: %");
        float interest = scanner.nextFloat();

        System.out.print("Period (years): ");
        int period = scanner.nextInt();

        //MORTGAGE CALCULATOR
        interest = interest/PERCENT;
        interest = interest/MONTHS;
        double periodInMonths = period*12;
        double mortgage = principal * (interest*(Math.pow(1+interest,periodInMonths)/(Math.pow(1+interest,periodInMonths)-1)));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Your monthly mortgage will be: "+ formatter.format(mortgage));

        //CLOSING SCANNER
        scanner.close();
    }
}