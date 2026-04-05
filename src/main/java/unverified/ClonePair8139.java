package unverified;

public class ClonePair8139 {

    long method1(long[] values){
      long highest=values[0];
      for (int i=1; i < values.length; i++)   if (values[i] > highest)   highest=values[i];
      return highest;
    }

    long method2(long[] a){
      long res=a[0];
      long buff;
      for (int i=1; i < a.length; i++) {
        buff=a[i];
        if (buff > res) {
          res=buff;
        }
      }
      return res;
    }
}
