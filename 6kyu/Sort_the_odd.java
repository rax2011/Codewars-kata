/*

You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
Examples

[7, 1]  =>  [1, 7]
[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]

 */
package sort_the_odd;

public class Sort_the_odd {

	public static int[] sortArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i; j < array.length; j++) {
				if(array[i] > array[j] && array[i] % 2 == 1 && array[j] % 2 == 1) {
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
	    return array;
	  }
}
