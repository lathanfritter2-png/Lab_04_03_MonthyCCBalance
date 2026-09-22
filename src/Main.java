public class Main {
    public static void main(String[] args) {

        double balance = 5000.00;
        double annualInterestRate = 0.17;
        double monthlyInterestRate = annualInterestRate / 12;

        double firstMonthInterest = 0.0;
        double secondMonthInterest = 0.0;

        firstMonthInterest = balance * monthlyInterestRate;
        balance = balance + firstMonthInterest;

        secondMonthInterest = balance * monthlyInterestRate;

        System.out.println("Interest due after one month: $" + firstMonthInterest);
        System.out.println("Interest due after two months: $" + secondMonthInterest);
    }
}
