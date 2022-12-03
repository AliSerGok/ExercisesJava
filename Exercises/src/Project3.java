import java.util.Arrays;

public class Project3 {
    private static double minDistanceCalculator(double[][] distanceArray, boolean[] controler,
                   int currentPos, int locationNumber,
                   int count, double distance, double minDistance)
    {

        // If last node is reached and it has a link
        // to the starting node i.e the source then
        // keep the minimum value out of the total distance
        // of traversal and "minDistance"
        // Finally return to check for more possible values
        if (count == locationNumber && distanceArray[currentPos][0] > 0)
        {
            minDistance = Math.min(minDistance, distance + distanceArray[currentPos][0]);
            return minDistance;
        }

        // BACKTRACKING STEP
        // Loop to traverse the adjacency list
        // of currentPos node and increasing the count
        // by 1 and distance by distanceArray[currentPos,i] value
        for (int i = 0; i < locationNumber; i++)
        {
            if (!controler[i] && distanceArray[currentPos][i] > 0)
            {

                // Mark as visited
                controler[i] = true;
                minDistance = minDistanceCalculator(distanceArray, controler, i, locationNumber, count + 1,
                        distance + distanceArray[currentPos][i], minDistance);

                // Mark ith node as unvisited
                controler[i] = false;
            }
        }
        return minDistance;
    }

    // Driver code
    public static void main(String[] args)
    {
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

        // locationNumber is the number of nodes i.e. V
        int locationNumber = 12;

        //double[][] distancevalues;

        // Boolean array to check if a node
        // has been visited or not
        boolean[] controler = new boolean[locationNumber];

        // Mark 0th node as visited
        controler[0] = true;
        double minDistance = Integer.MAX_VALUE;

        // Find the minimum weight Hamiltonian Cycle
        minDistance = minDistanceCalculator(distanceValues, controler, 0, locationNumber, 1, 0, minDistance);

        // minDistance is the minimum weight Hamiltonian Cycle
        System.out.println(minDistance);
        System.out.println(distanceValues[0][5]+"    burası");
    }
}

