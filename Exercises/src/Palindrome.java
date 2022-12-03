import java.util.ArrayList;
import java.util.Arrays;
import  java.util.Scanner;

public class Palindrome{

    public static void main(String[] args){
        System.out.println("lütfen sayıları giriniz");
        Scanner input=new Scanner(System.in);

        ArrayList<Integer> numbers=new ArrayList<Integer>();
        do {
            int x=input.nextInt();
            numbers.add(x);
            if(x==0){
                break;
            }
        }
        while (input.nextInt()!=0);

        int counter=0;

        for (int i=0;i<numbers.size();i++){
            counter=0;
            for(int j=0;j<numbers.size();j++){
                if(numbers.get(i).equals(numbers.get(j))){
                    counter++;

                }
            }
            System.out.println(numbers.get(i)+" sayısı listede "+counter+" kez bulunmaktadır");
        }


    }












}
