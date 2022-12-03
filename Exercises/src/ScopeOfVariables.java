import java.util.Arrays;

public class ScopeOfVariables {
    public static void main(String[] args){
        /*int sum = 0;
        int a=0;
        for (int i = 1; i <= 4; i++)
        {
            sum = sum + i;
            a=i;
        }
        System.out.println("Sum of " + a + " numbers is: " + sum);

         */

        int[] list = {6,3,1,6,5,4,-1,2,4,6};
        int key=-1;
        int[] result=linearSearch(list,key);

        System.out.println(Arrays.toString(result));





    }

    private static int[] linearSearch(int[] array,int keyNum){
        int counter=0;

        for(int i=0;i<array.length;i++) {
            if (keyNum == array[i]) {
                counter++;
            }

        }
        int[] indexArray = new int[counter];
        counter=0;

        int index=0;

        for(int j=0;j<array.length;j++){
            if(keyNum==array[j]){
                indexArray[index]=j;
                index++;
            }

        }
        if(index==0){
            int[] araays={0,0};
            return araays;
        }
        else{
        return indexArray;}



    }







}
