import java.util.Arrays;
import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args){

        System.out.println();
        System.out.println("Enter three numbers sort as increasing order");

        Scanner input=new Scanner(System.in);
        double number1=input.nextInt();
        double number2=input.nextInt();
        double number3=input.nextInt();
        displaySortedNumbers(number1,number2,number3);

    }

    public static void displaySortedNumbers(double num1, double num2, double num3){
        double[] sortedArray=new double[3];
        sortedArray[0]=num1;
        sortedArray[1]=num2;
        sortedArray[2]=num3;
        double x;
        for(int i=0;i<sortedArray.length;i++){
            for (int j=i+1;j<sortedArray.length;j++){
                if (sortedArray[i]>sortedArray[j]){
                    x=sortedArray[j];
                    sortedArray[j]=sortedArray[i];
                    sortedArray[i]=x;

                    System.out.println(Arrays.toString(sortedArray));

                }
            }

        }
    }

}
