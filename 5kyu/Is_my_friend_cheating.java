import java.util.ArrayList;
import java.util.List;
public class Is_my_friend_cheating{


	 public static List<long[]> removNb(long n) {
		    List<long[]> result = new ArrayList<long[]>();
		    long s = n * (n + 1) / 2;
		    for (long i = 1; i <= n; i++) {
		      long j = (s - i) / (i + 1);
		      if (j <= n && i * j == s - i - j) {
		        result.add(new long[] {i, j});
		      }
		    }
		    return result;
		  }
}
