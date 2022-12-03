import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args){
        System.out.println();
        System.out.println("Write a number ");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
       ;
        System.out.println(isPalindrome(number));
        System.out.println(reverse(number));

    }

    public static int reverse(int number){
        int reversedNumber=0;
        while(number!=0){
            reversedNumber*=10;
            reversedNumber+=number%10;
            number=number/10;
        }
        return reversedNumber;
    }

    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }
}
