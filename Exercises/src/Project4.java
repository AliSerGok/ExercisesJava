import java.util.ArrayList;

public class Project4 {
    public static void main(String[] args) {

        ArrayList<Double> distancesList=new ArrayList<>();
        ArrayList<String> locationList=new ArrayList<>();



        locationNumbers(new double[][]{
                {0.5250, 0.4538},
                {0.9125, 0.9213},
                {0.8025, 0.1700},
                {0.8525, 0.2200},
                {0.8725, 0.1500},
                {0.0813, 0.1075},
                {0.4788, 0.6200},
                {0.5488, 0.5938},
                {0.5725, 0.4962},
                {0.1363, 0.9225},
                {0.4500, 0.4450},
                {0.4038, 0.4875}},new int[]{2,3,4,5,6,7,8,9,1,11,12},Double.MAX_VALUE,distancesList,locationList);

       Double minValue=Double.MAX_VALUE;
       int ind=0;

       for (double e:distancesList){
           if(e<minValue){
               minValue=e;
               ind=distancesList.indexOf(e);
               System.out.println(minValue);
           }
       }







        
        
        
    }

    
    public static void locationNumbers(double[][]cord, int[] array, double minValue, ArrayList<Double> list, ArrayList<String> locationList){
        permutationMethod(cord,array, 0,minValue,list,locationList);


        
    }

    private static void permutationMethod(double[][]cord,int[] array, int index, double minValue,ArrayList<Double> list,ArrayList<String> locList){



        if(index >= array.length - 1){

            double x2=0;
            double y2=0;
            double totalDistance=0;
            int counter=0;
            double xx1=0;
            double yy1=0;





            int position=0;


            for(int i = 0; i < array.length ; i++){

                System.out.print(array[i] + " . ");


                double distance=0;

                double firstDistance=0;
                double lastDistance=0;
                double x1;
                double y1;

                ArrayList<String> tourList=new ArrayList<>();


                counter++;



                if(array[i]==2)
                    position=1;

                if(array[i]==3)
                    position=2;

                if(array[i]==4)
                    position=3;

                if(array[i]==5)
                    position=4;

                if(array[i]==6)
                    position=5;

                if(array[i]==7)
                    position=6;

                if(array[i]==8)
                    position=7;

                if(array[i]==9)
                    position=8;

                if(array[i]==11)
                    position=10;

                if(array[i]==12)
                    position=11;

                if(array[i]==1)
                    position=9;



                /*
                if(counter==1){
                    tourList.add(Integer.toString(10));
                    tourList.add(Integer.toString(array[i]));}
                if(counter==2)
                    tourList.add(Integer.toString(array[i]));
                if(counter==3)
                    tourList.add(Integer.toString(array[i]));
                if(counter==4)
                    tourList.add(Integer.toString(array[i]));
                if(counter==4)
                    tourList.add(Integer.toString(array[i]));
                if(counter==6)
                    tourList.add(Integer.toString(array[i]));
                if(counter==7)
                    tourList.add(Integer.toString(array[i]));
                if(counter==8)
                    tourList.add(Integer.toString(array[i]));
                if(counter==9)
                    tourList.add(Integer.toString(array[i]));
                if(counter==10)
                    tourList.add(Integer.toString(array[i]));
                if(counter==11){
                    tourList.add(Integer.toString(array[i]));
                tourList.add(Integer.toString(10));}

                 */


               // locfinder(tourList,locList);



                if(counter==11){
                    double x11 = cord[0][0];
                    double x22 = cord[position][0];
                    double y11 = cord[0][1];
                    double y22 = cord[position][1];

                    lastDistance = Math.pow(Math.pow(x11 - x22, 2) + Math.pow(y11 - y22, 2), 0.5);

                }


                if(totalDistance==0){

                    double x11 = cord[0][0];
                    double x22 = cord[position][0];
                    double y11 = cord[0][1];
                    double y22 = cord[position][1];





                    firstDistance = Math.pow(Math.pow(x11 - x22, 2) + Math.pow(y11 - y22, 2), 0.5);

                    x2 = x22;
                    y2 = y22;
                }


                if(counter!=1 && counter!=11) {

                    x1 = cord[position][0];
                    y1 = cord[position][1];

                    xx1 = x2;
                    yy1 = y2;



                    distance = Math.pow(Math.pow(x1 - xx1, 2) + Math.pow(y1 - yy1, 2), 0.5);

                    //System.out.println(x1+" "+y1+" "+" "+xx1+" "+yy1);

                    x2 = x1;
                    y2 = y1;


                }
                totalDistance+=firstDistance;
                firstDistance=0;

                totalDistance+=lastDistance;
                lastDistance=0;

                totalDistance+=distance;

                tourList=null;

                //System.out.println(totalDistance);








            }
            System.out.println();


            if(counter==11){
                minValueFinder(totalDistance,list);

            }






            totalDistance=0;
            counter=0;



            return;
        }



        for(int i = index; i < array.length; i++){ //For each index in the sub array array[index...end]

            //Swap the elements at indices index and i
            int x = array[index];
            array[index] = array[i];
            array[i] = x;

            //Recurse on the sub array array[index+1...end]
            permutationMethod(cord,array, index+1,minValue,list,locList);

            //Swap the elements back
            x = array[index];
            array[index] = array[i];
            array[i] = x;
        }
    }

    private static ArrayList<Double> minValueFinder(double totalDistance, ArrayList<Double> list){

        list.add(totalDistance);

        return list;



    }

    private static ArrayList<String> locfinder(ArrayList<String> positions, ArrayList<String> locList){

        locList.add(String.valueOf(positions));

        return locList;



    }









}
