import java.util.Arrays;

public class SwapArrayElements {
    public static void main(String[] args) {

        int[] originalArray = {10, 20, 30, 40, 50};

        System.out.println("Original Array: " + Arrays.toString(originalArray));

        int[] newArray = originalArray.clone(); 

        int temp = newArray[0];
        newArray[0] = newArray[newArray.length - 1];
        newArray[newArray.length - 1] = temp;

  
        System.out.println("New Array after swapping: " + Arrays.toString(newArray));
    }
}
