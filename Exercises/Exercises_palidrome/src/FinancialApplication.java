import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter amount of money");
        double amount=input.nextDouble();

        System.out.println("please enter rate of interest");

        double interest=input.nextDouble();

        System.out.println("please enter year");
        int year=input.nextInt();

       double investmentValue= futureInvestmentValue(amount,interest,year);
       System.out.println(investmentValue);

    }

    private static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate,int years){


        for(int i=0;i<years;i++){

                investmentAmount=investmentAmount+(investmentAmount/100)*monthlyInterestRate;

        }
        return investmentAmount;
    }
}
