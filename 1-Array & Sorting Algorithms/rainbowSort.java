public class Solution {
  public int[] rainbowSort(int[] array) {
    if (array == null || array.length <= 1){
    	return array;
    }
	int i = 0;
	int j = 0; // j需要追逐k，逐渐==>
	int k = array.length - 1;
	while(j <= k)
	//开始分情况讨论
	{ 
		if (array[j] == -1){
			swap(array,j,i)；
			i++;
			j++;			
		}
		else if (array[j] == 0){
			j++;
		}
		else if (array[j] == 1){
			swap(array,j,k);
			k--;
		}
		
	}
	return array;
	
	
  }
  
  private swap(int[] array, int a, int b){
  	int temp = array[b];
    array[b] = array[a];
    array[a] = temp;
  }
}
