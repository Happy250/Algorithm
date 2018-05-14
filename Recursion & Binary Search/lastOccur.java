public class Solution {
  public int lastOccur(int[] array, int target) {
   if (array == null || array.length == 0){
	   return -1; 
   }
   int left = 0;
   int right = array.length - 1;
   while ( left < right -1) 
	/* 
	因为我们找的是最后一个，遇到第一个相同的额，保留，往后面查看。
	要点就是所有的数字都要用到
	*/
   {
	   int mid = left + (right - left) / 2;
	   if (array[mid] <= target){
		   left = mid;
	   }
	   else {
		   right = mid;
	   }
   }
   
   //因为是最后一个出现，先判断右边
   
    if (array[right] == target){
	   return right;
   }
   else if (array[left] == target){
	   return left;
   }
   return -1;
  }
}
