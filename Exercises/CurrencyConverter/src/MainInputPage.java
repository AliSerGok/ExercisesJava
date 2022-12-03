import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class MainInputPage {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Your money curency if:\n Dolar (D) \n Euro (E) \n Lira (L)");
        String type1=input.next();
        System.out.println("Enter amount of money");
        double money=input.nextDouble();

        System.out.println("To convert:\n Dolar (D) \n Euro (E) \n Lira (L)");
        String type2= input.next();


        CurencyConverter converter=new CurencyConverter(money);
        if(type1.equals("D")&&type2.equals("D")){
           System.out.println(converter.same());

        }
        else if(type1.equals("D")&&type2.equals("E")){
            System.out.println(converter.dolarToEuro());

        }
        if(type1.equals("D")&&type2.equals("L")){
            System.out.println(converter.dolarToLira());

        }
        if(type1.equals("E")&&type2.equals("E")){
            System.out.println(converter.same());

        }
        if(type1.equals("E")&&type2.equals("D")){
            System.out.println(converter.euroToDolar());

        }
        if(type1.equals("E")&&type2.equals("L")){
            System.out.println(converter.euroToLira());

        }
        if(type1.equals("L")&&type2.equals("L")){
            System.out.println(converter.same());

        }
        if(type1.equals("L")&&type2.equals("D")){
            System.out.println(converter.liraToDolar());

        }
        if(type1.equals("L")&&type2.equals("E")){
            System.out.println(converter.liraToEuro());

        }





    }
}
