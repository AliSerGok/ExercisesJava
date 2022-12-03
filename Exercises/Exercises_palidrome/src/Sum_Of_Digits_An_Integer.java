import java.util.Scanner;

public class Sum_Of_Digits_An_Integer {
    public static void main(String[] args){
        System.out.println();
        System.out.println("Enter an ınteger Number");

        Scanner input=new Scanner(System.in);
        long number=input.nextLong();
        System.out.println(sumDigits(number));


    }

    private static int sumDigits(long n){
        int total=0;
        while (n!=0){
            total+=n%10;
            n=n/10;

        }
        return total;
    }

}
