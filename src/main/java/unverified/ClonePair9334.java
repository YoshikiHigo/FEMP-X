package unverified;

public class ClonePair9334 {

    int method1(int[] values){
      int largestvalue=values[0];
      for (int i=1; i < values.length; i++)   if (values[i] > largestvalue)   largestvalue=values[i];
      return largestvalue;
    }

    int method2(int[] a){
      int res=a[0];
      int buff;
      for (int i=1; i < a.length; i++) {
        buff=a[i];
        if (buff > res) {
          res=buff;
        }
      }
      return res;
    }
}
