package unverified;

public class ClonePair4468 {

    double method1(double[] x){
      if (x.length == 0)   return Double.NaN;
      double total=0;
      for (  double v : x) {
        total+=v;
      }
      return total / x.length;
    }

    double method2(double[] series){
      double res=0D;
      int count=0;
      for (  double tp : series) {
        if (Double.isNaN(tp) || Double.isInfinite(tp)) {
          continue;
        }
     else {
          res+=tp;
          count+=1;
        }
      }
      if (count > 0) {
        return res / ((Integer)count).doubleValue();
      }
      return Double.NaN;
    }
}
