package unverified;

public class ClonePair9504 {

    int method1(int[] _d){
      int max=_d[0];
      for (int i=1; i < _d.length; i++) {
        if (_d[i] > max)     max=_d[i];
      }
      return max;
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
