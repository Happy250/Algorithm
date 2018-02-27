import java.util.Arrays;

public class SelectionSort {

    public int[] sort(int[] array) {
        if (array==null || array.length<=1){
            return array;
        }
        int len=array.length;
        for (int i = 0; i < len - 1; i++) {
            int minIdx = i;
            for (int j=i+1;j<len;j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            swap(array,minIdx,i);
        }
            return array;
    }

    public void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int[] test = new int[]{3,5,1,4,8};
        SelectionSort sq= new SelectionSort();
        System.out.print(Arrays.toString(sq.sort(test)));
    }
}
