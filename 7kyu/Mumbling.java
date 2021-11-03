/*The examples below show you how to write function accum:*/
/*Examples:

accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
*/

package mumbling;
import  java.util.Arrays;
import java.util.Locale;
public class Mumbling {
	 public static void main(String[] args) {
	 System.out.println(accum("EvidjUnokmM"));
	 }
	
	public static String accum(String s) {
		String rez ="";
		for(int i = 0; i < s.length(); i++) {
			rez = rez + s.substring(i,i+1).toUpperCase();
			for(int j = 0; j < i; j++) {
				if(Character.isUpperCase(s.charAt(i))) {
					rez = rez + s.substring(i,i+1).toLowerCase();
				} else {
				rez = rez + s.substring(i,i+1);
				}
			}
			rez = rez + "-";
		}
          return  rez.substring(0, rez.length() - 1);
	}

}
