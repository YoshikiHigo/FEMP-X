package unverified;

public class ClonePair4613 {

    double method1(double[] a){
      double b=a[0];
      for (int i=0; i < a.length; i++)   if (a[i] > b)   b=a[i];
      return b;
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
