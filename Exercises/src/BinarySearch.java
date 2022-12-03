public class BinarySearch {

    public static void main(String[] args){

        int[] inputArray = {1,6,20,34,45,51,68,77,80,93,106,118,127,131,145};

        int key=6;
        int result=binarySearch(inputArray,key);
        System.out.println(result);

    }

    private static int binarySearch(int[] array,int keyNum){

        int min=0;
        int max=array.length-1;


        while(min<max){
            int middle=(min+max)/2;
            if(keyNum==array[middle]){
                return middle;

            }
            else if(keyNum>array[middle]){
                min=middle+1;
            }
            else {
                max=middle-1;

            }

        }
        return -1;


    }



}
