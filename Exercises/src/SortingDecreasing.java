import java.util.Arrays;

public class SortingDecreasing{
    public static void main(String[] args){

        int[] numbers= {21,4,35,16,8,4,74,15,24,36,20,12,8};
        sortinMethod(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    private static void sortinMethod(int[] array){
        int current=0;


        for(int i=0;i<array.length;i++){

            current=i;

            for(int j=0;j<array.length;j++){
                if(array[i]<array[j]){
                    current=array[i];
                    array[i]=array[j];
                    array[j]=current;
                }
            }
        }

    }


}
