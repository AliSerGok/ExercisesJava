import java.util.Scanner;

public class PentagonalNumbers {

    public static void main(String[] args){

        System.out.println();
        System.out.println("Enter 0 to see first 100 pentogonal numbers");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();

        for(int i=1;i<100;i++){
            System.out.print(String.format("%d  ",getPentagonalNumber(i)));
            if(i%10==0){
                System.out.println();
            }
        }


    }

   private static int getPentagonalNumber(int n){

        return n*(n*3-1)/2;

    }


}
