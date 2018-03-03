public class Solution {
  public int firstOccur(int[] array, int target) {
   if (array == null || array.length == 0){
	   return -1; 
   }
   int left = 0;
   int right = array.length - 1;
   while ( left < right -1)
/* 
因为我们找的是第一个，所以尽量往前面取。
要点就是所有的数字都要用到
*/
   {
	   int mid = left + (right - left) / 2;
	   if (array[mid] >= target){
		   right = mid; // 同样的元素，更早出现只有可能在前面。
	   }
	   else {
		   left = mid;
	   }
   }
   
   
   //因为是第一个出现，先判断左边
   if (array[left] == target){ 
	   return left;
   }
   else if (array[right] == target){
	   return right;
   }
   return -1;
  }
}