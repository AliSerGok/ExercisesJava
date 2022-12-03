import java.util.ArrayList;
import java.util.Arrays;

public class Project2 {
    public static void main(String[] args) {
        String[] locationNames = {"10", "2", "3", "4", "5", "6", "7", "8", "9", "1", "11", "12"};
        double[][] cordinates = {
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
                {0.4038, 0.4875}};







    }

    private static double loopMethod(double[][] cordinates){

        int currentIndex;
        int nextIndex;


        double[][] distanceValues = new double[12][12];

        String[][] vector;
        vector = new String[12][];


        for (currentIndex = 0; currentIndex < cordinates.length; currentIndex++) {

            int counter = 0;

            for (nextIndex = 0; nextIndex < cordinates.length; nextIndex++) {

                double distance = 0;


                double x1 = cordinates[currentIndex][0];
                double x2 = cordinates[nextIndex][0];
                double y1 = cordinates[currentIndex][1];
                double y2 = cordinates[nextIndex][1];


                distance = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);

                distanceValues[currentIndex] = new double[cordinates.length];
                distanceValues[currentIndex][counter] = distance;

                vector[currentIndex] = new String[cordinates.length];
                vector[currentIndex][counter] = Integer.toString(currentIndex) + "-->" + Integer.toString(nextIndex);
                counter++;

                System.out.println(Arrays.toString(distanceValues[currentIndex])+counter);


            }




        }

        double totalDistance = 0;

        String[] memoryNames = new String[12];
        int[][] memoryIndex=new int[12][];
        ArrayList<Integer> memoryIndexList = new ArrayList<Integer>();
        int lastIndex=0;


        for (currentIndex = 0; currentIndex < cordinates.length; currentIndex++) {

            for (nextIndex = 0; nextIndex < cordinates.length; nextIndex++) {

                if ((currentIndex != nextIndex) && !memoryIndexList.contains(currentIndex) && !memoryIndexList.contains(nextIndex)) {


                    totalDistance = totalDistance + distanceValues[currentIndex][nextIndex];

                    memoryNames[currentIndex] = vector[currentIndex][nextIndex];

                    memoryIndexList.add(currentIndex);
                    memoryIndexList.add(nextIndex);


                    System.out.println(totalDistance+"hjvhv");





                }






            }


        }

        return totalDistance;

    }



}
