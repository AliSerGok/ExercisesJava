import java.util.Scanner;

public class Constractor {

    public static void main(String[] args){

        System.out.println();
        System.out.println("0000000");

        Scanner input=new Scanner(System.in);
        double number1=input.nextDouble();
        System.out.println(number1);
        System.out.println("addition (+)\nextraction (-) \nmultiplication (*)\ndivision (/)\nsquaring (')");
        String operation= input.next();

        double number2=input.nextDouble();
        System.out.println();
        System.out.println(number1+operation+number2+"=");

        HesapMakinası makine=new HesapMakinası(number1,number2,operation);
        if(operation.equals("+")){
            System.out.print(makine.addition());
        }
        else if(operation.equals("-")){
            System.out.print(makine.minus());

        }
        else if(operation.equals("*")){
            System.out.print(makine.multiply());

        }
        else if(operation.equals("/")){
            System.out.print(makine.divition());

        }
        else if(operation.equals("'")){
            System.out.print(makine.square());

        }
        else{
            System.out.println("Error");
        }


    }



}
