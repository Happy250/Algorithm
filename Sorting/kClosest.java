public class Solution {
  public int[] kClosest(int[] array, int target, int k) {
    if (array == null || array.length == 0){
		return array;
	}
	if (k == 0 || k > array.length){
		return new int[0];
	}
	int left = findLargestSmallerEqual(array,target);
	int right = left + 1;
	int[] result = new int[k];
	for (int i = 0; i < k; i++ ){
		if (right >= array.length || left >= 0 
		&& target - array[left] <= array[right] - target)
		//因为我们这里的找到的数字是尽量靠后，所以我们尽量往前寻找元素，对于right++的情况趋于谨慎。
		{
			result[i] = array[left--];
		}
		else {
			result[i] = array[right++];
		}
	}
	return result;
	
  }
  
  public int findLargestSmallerEqual(int[] array, int target){
	  /*
	  这种条件的判断可以参考lastOccur的情况
	  都是偏向于查找后面的元素
	  */
	  int left = 0;
	  int right = array.length - 1;
	  while (left <  right - 1){
		  int mid = left + (right - left) / 2;
		  if (array[mid] <= target){
			  left = mid;
		  }
		  else {
			  right = mid;
		  }
	  }
	  if (array[right] <= target){
		  return right;
	  }
	  if (array[left] <= target){
		  return left;
	  }
	  return -1;  
  }
}
