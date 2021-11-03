// Find the unique number
// Level: 6kyu
/*
There is an array with some numbers. All numbers are equal except for one. Try to find it!
Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
*/
package find_the_unique_number;

import java.util.Arrays;

public class Find_the_unique_number {


	public static double findUniq(double arr[]) {
   Arrays.sort(arr);
   if(arr[0] == arr[1])
	   return arr[arr.length - 1];
   return arr[0];
}
}