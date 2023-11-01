import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TipCalculator L = new TipCalculator();
        System.out.print("How much is the bill? ");
        String billAmount = s.nextLine();
        double bill = Integer.parseInt(billAmount);
        System.out.print("How much is the tip ");
        String tipAmount  = s.nextLine();
        double tip = Integer.parseInt(tipAmount);
        System.out.print("How many people are there? ");
        String peopleCount = s.nextLine();
        double people = Integer.parseInt( peopleCount);


        L.calculateTipAmount();
        L.calculateTotalBillAmount();
        L.calculateTipPerPerson();
        L.calculateTotalPerPerson();
        System.out.print("Name: Adib Miah ");
        System.out.print("Favorite Movie: Spiderman 2 ");
        s.close();
    }
}