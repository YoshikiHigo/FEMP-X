package unverified;

public class ClonePair5148 {

    boolean method1(double[] vec1,double[] vec2){
      if (vec1.length != vec2.length)   return (false);
      for (int i=0; i < vec1.length; ++i)   if (vec1[i] != vec2[i])   return (false);
      return (true);
    }

    boolean method2(double[] x,double[] y){
      if (x.length != y.length) {
        return false;
      }
      for (int i=0; i < y.length; i++) {
        if (x[i] != y[i]) {
          return false;
        }
      }
      return true;
    }
}
