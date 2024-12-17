package Arrays.Easy;

public class LargestElementInArray {

    public static int largestElement(int [] arr){

        int max = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            if ( max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int [] arr = {2,3,5,2,7};

        System.out.println("The largest element in this array: "+largestElement(arr));

    }
}
