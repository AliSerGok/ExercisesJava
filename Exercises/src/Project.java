import java.util.Arrays;

public class Project {
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


        double totalDistance = 0;

        String nameMemory = null;

        int currentIndex;
        int nextIndex;


        double[][] distanceValues = new double[12][];
        String[][] vector=new String[12][];


        for (currentIndex = 0; currentIndex < cordinates.length; currentIndex++) {

            int counter = 0;

            for (nextIndex = currentIndex + 1; nextIndex < cordinates.length; nextIndex++) {

                double distance=0;


                double x1 = cordinates[currentIndex][0];
                double x2 = cordinates[nextIndex][0];
                double y1 = cordinates[currentIndex][1];
                double y2 = cordinates[nextIndex][1];

                if (cordinates[currentIndex] != cordinates[nextIndex]) {
                    distance = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);

                    distanceValues[currentIndex]=new double[cordinates.length-(currentIndex+1)];
                    distanceValues[currentIndex][counter]=distance;

                    vector[currentIndex]=new String[cordinates.length-(currentIndex+1)];
                    vector[currentIndex][counter]=Integer.toString(currentIndex)+"-->"+Integer.toString(nextIndex);
                    counter++;

                }

                System.out.println(Arrays.toString(distanceValues[currentIndex]));
                System.out.println(Arrays.toString(vector[currentIndex]));


            }

            System.out.println();
            //System.out.println(Arrays.toString(distanceValues[currentIndex]));






        }

        System.out.println(distanceValues);

        //private static double[] arrayCreator(double[] a){


        // }

        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int g=0;
        int h=0;
        int k=0;
        int l=0;
        int m=0;

        double[][][][][][][][][][][] allDistances=new double[11][10][9][8][7][6][5][4][3][2][1];

        /* allDistances[a][b][c][d][e][f][g][h][k][l][m]=totalDistance;


                       if(currentIndex==0){
                            a=currentIndex;
                            b=nextIndex;

                            allDistances[a][b][c][d][e][f][g][h][k][l][m]=totalDistance;

                        }*/

        //System.out.println(distanceValues[currentIndex][nextIndex]);
        //System.out.println(currentIndex+"  "+nextIndex);
        //System.out.println(totalDistance);

    }





}
