import java.util.Arrays;

public class SelectionSort {

    public int[] sort(int[] array) {
        if (array==null || array.length<=1){
            return array;
        }
        int len=array.length;
        int global,temp;
        for (int x=0;x<len;x++){
            global=x;
            for (int y=x+1;y<len;y++){
                if (array[global]>array[y]){
                    global=y;
                }
            }
            temp=array[x];
            array[x]=array[global];
            array[global]=temp;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] test = new int[]{3,5,1,4,8};
        SelectionSort sq= new SelectionSort();
        System.out.print(Arrays.toString(sq.sort(test)));
    }
}
