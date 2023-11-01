public class TipCalculator {

    public double bill;
    public double tip;
    public double people;
    public double tipAmount;

    public void calculateTipAmount(){
        System.out.println("The total tip amount is " + ((double) (bill * tip) - (bill)));
    }
    public void calculateTotalBillAmount(){
        System.out.println("The total bill including tip is " + ((int) (bill * tip)));
    }
    public void calculateTipPerPerson(){
        System.out.println("The tip per person is " + ((( (int) bill * tip) - (bill))) / people);
    }

    public void calculateTotalPerPerson()
    {
        System.out.println("The total per person is " + (((( (int) bill * tip))) / (people)));
    }

}

