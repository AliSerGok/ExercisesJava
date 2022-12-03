import java.util.Arrays;

public class MigrosProject {
    public static void main(String[] args){
        String[] locationNames={"10","2","3","4","5","6","7","8","9","1","11","12"};
        double[][] cordinates={
                {0.5250,0.4538},
                {0.9125,0.9213},
                {0.8025,0.1700},
                {0.8525,0.2200},
                {0.8725,0.1500},
                {0.0813,0.1075},
                {0.4788,0.6200},
                {0.5488,0.5938},
                {0.5725,0.4962},
                {0.1363,0.9225},
                {0.4500,0.4450},
                {0.4038,0.4875}};

        double minDistance=Double.MAX_VALUE;
        double distance=0;

        String[] pathOfDelivery= new String[cordinates.length+1];


        double totalDistance=0;
        int counter=0;
        String nameMemory=null;

        int currentIndex;
        int nextIndex;



        for(currentIndex=0;currentIndex<cordinates.length;currentIndex++){

            for(nextIndex=currentIndex+1;nextIndex<cordinates.length;nextIndex++){

                pathOfDelivery[currentIndex]=locationNames[currentIndex];

                double x1=cordinates[currentIndex][0];
                double x2=cordinates[nextIndex][0];
                double y1=cordinates[currentIndex][1];
                double y2=cordinates[nextIndex][1];

                if(cordinates[currentIndex]!=cordinates[nextIndex]){
                    distance=Math.pow(Math.pow(x1-x2,2)+Math.pow(y1-y2,2),0.5);
                }

                System.out.println(distance);

                totalDistance+=distance;



                System.out.println(totalDistance+"         1");



            }


            currentIndex=nextIndex;


            if(totalDistance<minDistance){
                minDistance=totalDistance;
                counter++;
                System.out.println(totalDistance);

            }

            if(currentIndex==11){
                break;
            }
        }

        for(int i=0;i<1;i++){

            System.out.println(currentIndex);

            pathOfDelivery[11]=locationNames[0];

            double x1=cordinates[currentIndex][0];
            double x2=cordinates[0][0];
            double y1=cordinates[currentIndex][1];
            double y2=cordinates[1][1];

            if(cordinates[currentIndex]!=cordinates[0]){
                distance=Math.pow(Math.pow(x1-x2,2)+Math.pow(y1-y2,2),0.5);
            }

            totalDistance+=distance;

            if(totalDistance<minDistance){
                minDistance=totalDistance;
                counter++;

                System.out.println(minDistance+"    min");

            }

        }
        System.out.println(pathOfDelivery);










    }
}
