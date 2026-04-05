package unverified;

public class ClonePair4637 {

    double method1(double[] v){
      double max=v[0];
      for (int i=1; i < v.length; i++) {
        if (max < v[i]) {
          max=v[i];
        }
      }
      return (max);
    }

    double method2(double[] verteces){
      double r;
      r=verteces[0];
      for (int i=0; i < verteces.length; i++) {
        if (verteces[i] > r) {
          r=verteces[i];
        }
      }
      return r;
    }
}
