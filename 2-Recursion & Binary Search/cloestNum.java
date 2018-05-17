package code;

public class cloestNum {
	public int closest(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		int left = 0;
		int right = array.length - 1;
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				return mid;
			}
			else if (array[mid] > target) {
				right = mid;
			}
			else {
				left = mid;	
			}
		}
		
		return aCloserThanb(array[left], array[right], target) ? left:right;
		
	}

	private boolean aCloserThanb(int a, int b, int target) {
		return Math.abs(target - a) <= Math.abs(target - b) ? true:false;
	}

}
