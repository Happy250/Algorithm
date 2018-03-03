public class Solution {
  public int[] search(int[][] matrix, int target) {
	if ( matrix.length == 0 || matrix[0].length == 0 ){
		return new int[] {-1,-1};
	}
	int rows = matrix.length;
	int columns = matrix[0].length;
	int left = 0;
	int right = rows * columns - 1;	
	while (left <= right){
		int mid = left + (right - left)/2;
		int row = mid / columns;
		int col = mid % columns;
		if (matrix[row][col] == target){
			return new int[] {row,col};
		}
		else if (matrix[row][col] > target){
			right = mid - 1;
		}
		else {
			left = mid + 1;
		}
		
	}
	return new int[] {-1, -1}
	
	
  }
}