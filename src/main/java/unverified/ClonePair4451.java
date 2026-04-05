package unverified;

public class ClonePair4451 {

    double method1(double[] targets){
      double highest=targets[0];
      for (int i=1; i < targets.length; ++i)   if (highest < targets[i])   highest=targets[i];
      return highest;
    }

    double method2(double[] a){
      double res=a[0];
      double buff;
      for (int i=1; i < a.length; i++) {
        buff=a[i];
        if (buff > res) {
          res=buff;
        }
      }
      return res;
    }
}
