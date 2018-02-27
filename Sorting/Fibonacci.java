public class Solution {
	// Method with O(1) space
  public long fibonacci1(int K) {
  long a = 0;
  long b = 1;
  if (K <= 0){
  return a;
  }
  while (K > 1){
  long temp = a + b;
  a = b;
  b = temp;
  K --;
  }
  return b;
  }
  
  	// Method with O(n) space
  public long fibonacci2(int K){
	if (K <= 0){
		return 0;
	}
	long[] array = new long[K+1];
	array[0] = 0;
	array[1] = 1;
	for ( int i = 2; i <= K; i++){
		array[i]=array[i-2]+array[i-1];
		
	}
	return array[K];
  }
  
}