import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //User input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Interest rate: ");
        float interest = scanner2.nextFloat();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Period (years): ");
        int period = scanner3.nextInt();

        //Mortgage calculation
        interest = interest/100;
        interest = interest/12;
        double periodInMonths = period*12;
        double mortgage = principal * (interest*(Math.pow(1+interest,periodInMonths)/(Math.pow(1+interest,periodInMonths)-1)));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage: "+ formatter.format(mortgage));










    }
}