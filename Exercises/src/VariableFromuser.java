import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class VariableFromuser {
    public static void main(String[] args){

      /* System.out.println("bir kilonuzu giriniz");
        Scanner userVariable = new Scanner(System.in);

        int deger = userVariable.nextInt();

        if (deger>80){
            System.out.println("çok kilolusun ve zayıflasan iyi olur");

        }
        else{
            System.out.println("kilon iyi cigeram");
        }

        Scanner kardesSayisi=new Scanner(System.in);
        double kardes=kardesSayisi.nextDouble();
        System.out.println("kardeş sayısı:"+ kardes+" dir");

       // Scanner userName=new Scanner(System.in)
       // String name=userName.next

        for(int i=0;i<9;i++){
            System.out.println("sayı: "+ (i+1));
        }

        int a=10;
        int b=4;
        System.out.println((double)a/b);

        int rand=(int)(Math.random()*10);
        Scanner input=new Scanner(System.in);

        int i=0;
        while(i<20){

            int deger=input.nextInt();
            if(deger==rand){
                System.out.println("tutturdun! Doğru sayı:"+deger );
                break;
            }
            else{
                i++;
                System.out.println(i);
            }
        }


        Scanner veri=new Scanner(System.in);
        int toplam=0;
        int sayin=-1;

        while(sayin!=0){
            System.out.println("lütfen sayıyı giriniz");
            int sayi=veri.nextInt();
            toplam+=sayi;
            if (sayi==0){
                System.out.println("toplam:"+toplam);
                break;
            }
        }

        for(int i=0;i<=10;i++){
            for(int j=0;j<=10;j++){
                System.out.println(i+" X "+j+" = "+(i*j));
            }
            System.out.println();
        }

        Scanner number=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz");
        int sayi1=number.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int sayi2=number.nextInt();

        int bolen=1;
        int ebb=0;

        while(bolen<=sayi1&&bolen<=sayi2){
            if(sayi1%bolen==0&&sayi2%bolen==0){
                ebb=bolen;
            }
            bolen++;
        }
        System.out.println(ebb);


        int[] myList=new int[10];
        Scanner input=new Scanner(System.in);

        for(int i=0;i<myList.length;i++){
            System.out.println((i+1)+". Sayıyı giriniz");
            myList[i]=input.nextInt();

        }

        int toplam=0;

        for(int j=0;j<myList.length;j++){
            toplam+=myList[j];
        }

        System.out.println("girilen sayıların ortalaması "+(toplam/myList.length)+"'dır");

        int ort=toplam/myList.length;

        for(int k=0; k<myList.length;k++){
            if(myList[k]>ort){
                System.out.println(myList[k]+" sayısı ortalamadan büyüktür");
            }
        }

        int[] myList={0,1,2,3,4,5,6,7,8,9};


        for(int i=0;i<myList.length;i++){
            int j=(int)(Math.random()*myList.length);
            int current=myList[i];
            myList[i]=myList[j];
            myList[j]=current;
        }

        for(int k=0;k<myList.length;k++){
            System.out.println(myList[k]);
        }


        int[] myList={12,35,1,25,45,16,74,32,85,24};
        int current=myList[0];


        for(int i=0;i<myList.length;i++){
            if(myList[i]<current){
                int x= myList[i];
                myList[i]=current;
                current=x;

            }
        }

        for(int k=0;k<myList.length;k++){
            System.out.println(myList[k]);
        }

        int[] myArray= {1,2,3,4};

        int[] sec={10,20,30,40,60,70,90};

        int[] target=myArray.clone();

        myArray=null;

        myArray=new int[sec.length];

        System.arraycopy(sec,0,myArray,0,sec.length);

        for(int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }



        int[] products = {120, 30, 250, 100, 20, 50, 8, 400, 500};

        int count=0;

        for(int i=0;i<products.length;i++){
            if(products[i]<100){
               count++;
            }
        }

        int[] cheapProducts=new int[count];
        int cnt2=0;

        for(int i=0;i<products.length;i++){
            if(products[i]<100){
                cheapProducts[cnt2]=products[i];
                cnt2++;

            }
        }
        for(int e: cheapProducts){
            System.out.println(e);
        }

        double[] inputArray = {4.6, 0.2, 9.3, -1.2, 0.01, 7.1, 2.1};

        double[] storeArray=new double[7];

        storeArray=inputArray.clone();

        inputArray=null;

        inputArray=new double[8];

        System.arraycopy(storeArray,0,inputArray,1,storeArray.length);
        inputArray[0]=8;


        for(double e:inputArray){
            System.out.println(e);
        }
        //--------------------------------------------------------------------------------------------
        double[] inputArray = {4.6, 0.2, 9.3, -1.2, 0.01, 7.1, 2.1};
        double x=0;

        for(int i=0;i<inputArray.length;i++){
            for(int j=i+1;j<inputArray.length;j++){
                if(inputArray[i]>inputArray[j]){
                    x=inputArray[i];
                    inputArray[i]=inputArray[j];
                    inputArray[j]=x;

                }
            }
        }
        for(double e: inputArray){
            System.out.print(e+" ");
        }
       //-------------------------------------------------------------------------------------------------

        String[] products = {"Nike", "Adidas", "Vans", "Converse", "Puma", "NewBalance", "Asics", "Slazenger", "Columbia", "NorthFace"};
        String[] itemSold = {"Vans","Vans","Adidas","Asics","Asics","Asics","Puma","NorthFace","Vans","Vans","Adidas","Asics","Vans"};
        int[] priceSold = {300,400,350,450,250,250,350,475,325,225,600,700,150};


        String maxItemName=null;
        String currentItem=null;
        int maxsoldprice=0;

        for(int i=0;i<products.length;i++){

            int totalSold=0;
            currentItem=products[i];


            for(int j=0;j<itemSold.length;j++){
                if(products[i]==itemSold[j]){
                    totalSold+=priceSold[j];

                }


                if(totalSold>maxsoldprice){
                    maxsoldprice=totalSold;
                    maxItemName=currentItem;

                }


            }
            System.out.println(currentItem+"       "+totalSold);


        }
        System.out.println("En çok satan ürün: "+maxItemName+" "+maxsoldprice);

        //--------------------------------------------------------------------------------------------------

        String[] names= {"jhon","alice","bob","sarah","robert"};

        int[][] grades=new int[5][];

        grades[0]=new int[2];
        grades[0][0]=80;
        grades[0][1]=70;

        grades[1]=new int[4];
        grades[1][0]=90;
        grades[1][1]=60;
        grades[1][2]=30;
        grades[1][3]=95;

        grades[2]=new int[3];
        grades[2][0]=30;
        grades[2][1]=55;
        grades[2][2]=75;

        grades[3]=new int[5];
        grades[3][0]=100;
        grades[3][1]=90;
        grades[3][2]=95;
        grades[3][3]=100;
        grades[3][4]=85;

        grades[4]=new int[7];
        grades[4][0]=70;
        grades[4][1]=56;
        grades[4][2]=75;
        grades[4][3]=80;
        grades[4][4]=70;
        grades[4][5]=90;
        grades[4][6]=55;

        String maxSuccessfull=null;
        double maxAvarage=0;


        for(int i=0; i<grades.length;i++){
            double totalScore=0;
            double avr=0;
            String currentName=null;
            for(int j=0;j<grades[i].length;j++){
                totalScore+=grades[i][j];
                currentName = names[i];
            }
            avr=totalScore/grades[i].length;
            System.out.println(currentName+"'ın not ortalaması "+(avr)+"'dir");

            if(avr>maxAvarage){
                maxAvarage=avr;
                maxSuccessfull=currentName;
            }



        }
        System.out.println("Grubun en yuksek not ortalaması "+maxSuccessfull+" adlı öğrenciye aittir ve ortalaması "+maxAvarage+"'dir");

        //----------------------------------------------------------------------------------------------------------------


        String[] citys={"A","B","C","D","E","F","G","H"};

        double[][] locations= {
                {-1.0,3.0},
                {-1.0,-1.0},
                {1.0,1.0},
                {3.0,3.0},
                {4.0,2.0},
                {2.0,0.5},
                {2.0,-1.0},
                {4.0,-0.5}};

        double distant=0;
        double minDistant=100;
        String currentNamei=null;
        String currentNamej=null;
        String city1=null;
        String city2=null;

        for(int i=0;i<locations.length;i++){

            double x=0;
            double y=0;

            x=locations[i][0];
            y=locations[i][1];
            currentNamei=citys[i];

            for(int j=0;j<locations.length;j++){
                double x2=0;
                double y2=0;
                currentNamej=citys[j];

                x2=locations[j][0];
                y2=locations[j][1];

                if(i!=j){
                    distant=Math.sqrt(((x-x2)*(x-x2))+((y-y2)*(y-y2)));
                    if(distant<minDistant){
                        minDistant=distant;
                        city1=currentNamei;
                        city2=currentNamej;
                }



                }

            }
        }
        System.out.println("Closest cities are "+city1+" and "+city2+" and their distance between is "+minDistant);




        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        Arrays.sort(numbers);

        String str = Arrays.toString(numbers);
        System.out.println(str);

        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 10};
        int[] list3 = {4, 2, 7, 10};
        System.out.println(java.util.Arrays.equals(list1, list2)); // prints true
        System.out.println(java.util.Arrays.equals(list2, list3)); // prints false

        int[] list = new int[5];
        java.util.Arrays.fill(list, 88); // Fill 88 to the whole array
        System.out.println(Arrays.toString(list));

       */




























    }
}






