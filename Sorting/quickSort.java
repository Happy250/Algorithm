import java.util.Arrays;

public class Solution {
    public int[] quickSort(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotPos = partition(array, left, right);
        quickSort(array, left, pivotPos - 1);
        quickSort(array, pivotPos + 1, right);
    }
    /*
    这两步骤，将array分成尽可能小的部分（Recursion）然后进行操作
    例如：45132
    先找到pivot ==> 3，确定了3的位置，然后对于3的前后两个部分继续找pivot确定位置
    */
    private int partition(int[] array, int left, int right) {
        int pivotIndex = generatePivotIndex(left, right);
        int pivotValue = array[pivotIndex];
        swap(array, pivotIndex, right);
        int leftbound = left;
        int rightbound = right - 1;
        while (leftbound <= rightbound) {
            if (array[leftbound] < pivotValue) {
                leftbound++;
            } else if (array[rightbound] >= pivotValue) {
                rightbound--;
            } else {
                swap(array, leftbound++, rightbound--);
            }

        }
        swap(array, leftbound, right);
        return leftbound;
    }

    private int generatePivotIndex(int left, int right) {
        return left + (int) (Math.random() * (right - left + 1));
    }

    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int[] test = new int[]{2, 3, 5, 1, 7, 4, 8};
        Solution so = new Solution();
//        String result = so.quickSort(test).toString();
        System.out.print(Arrays.toString(so.quickSort(test)));
    }

}
