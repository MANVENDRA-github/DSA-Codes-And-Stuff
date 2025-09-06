import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args) {
        int[] arr={3,2,4,1,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){

        //checks every element in the array and swaps if the right one is smaller than the left one
        //after each pass the largest number comes at the end

        boolean swapped;

        for(int i=0;i<arr.length;i++){

            swapped=false;

            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){

                    //swap both elements
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(swapped==true){
            break;
        }
        }
        
    }
}

