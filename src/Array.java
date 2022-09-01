import java.util.Arrays;

public class Array {
    public static int remove_Duplicate_Elements(int[] arr, int n){
        int[] tempA = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                tempA[j++] = arr[i];
            }
        }
        tempA[j++] = arr[n-1];
        if (j >= 0) System.arraycopy(tempA, 0, arr, 0, j);
        return j;
    }

    public static void main (String[] args) {
        int[] arr = {11,7,2,2,7,8,8,8,3,3};
        Arrays.sort(arr);
        int length = arr.length;
        length = remove_Duplicate_Elements(arr, length);
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
    }
}
