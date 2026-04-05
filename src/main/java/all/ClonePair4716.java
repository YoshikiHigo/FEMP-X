package all;

public class ClonePair4716 {

    double method1(double[] a){
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

    double method2(double[] array){
      double max=array[0];
      for (  double d : array)   if (d > max)   max=d;
      return max;
    }
}
