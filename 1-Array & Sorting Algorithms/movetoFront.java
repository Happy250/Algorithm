package code;

public class movetoFront {
	public int[] solution(int[] array) {
		if (array == null || array.length <=0) {
			return array;
		}
		int left = 0;
		int right = array.length - 1;
		while (right >= left) {
			if (array[right] != 0) {
				right--;
			}
			else if (array[left] == 0) {
				left++;
			}
			else {
				swap(array,right--,left++);
			}
				
		}
		
		return array;
	}
	
	private void swap(int[] array, int a, int b) {
		int temp = array[b];
		array[b] = array[a];
		array[a] = temp;
	}
}
