import java.util.Arrays;

public class ArraysInMethods {

    public static void main(String[] args){
        /*
        int[] input={2,11,4,16,7};

        int[] result=less10(input);
        System.out.println(Arrays.toString(result));


    }

    private static int[] less10(int[] less){
        int counter=0;
        for(int i=0;i<less.length;i++){
            if(less[i]<10){
                counter++;

            }
        }
        int[] newOutputArray=new int[counter];
        int a=0;
        for(int j=0;j<less.length;j++){
            if(less[j]<10){
                newOutputArray[a]=less[j];
                a++;
            }

        }
        return newOutputArray;


    int[] inputArray = {2,11,4,16,7};
    int[] outputArray = reverse(inputArray);

    System.out.println(Arrays.toString(outputArray));



    }

    private static int[] reverse(int[] array){
        int firstIndex=0;
        int lastIndex=array.length-1;
        int current=0;

        for(int i=0;i<array.length;i++){
            current=array[firstIndex];
            array[firstIndex]=array[lastIndex];
            array[lastIndex]=current;
            firstIndex++;
            lastIndex--;
            if(firstIndex==lastIndex){
                break;
            }
        }
        return array;


         */


        int[] inputArray = {2,11,4,16,7};
        reverse(inputArray);

        System.out.println(Arrays.toString(inputArray));



    }


    private static void reverse(int[] array) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int current = 0;

        for (int i = 0; i < array.length; i++) {
            current = array[firstIndex];
            array[firstIndex] = array[lastIndex];
            array[lastIndex] = current;
            firstIndex++;
            lastIndex--;
            if (firstIndex == lastIndex) {
                break;
            }
        }

    }











}
