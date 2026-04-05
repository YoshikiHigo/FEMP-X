package unverified;

public class ClonePair4720 {

    double method1(double[] v){
      double min=v[0];
      for (int i=1; i < v.length; i++) {
        if (min > v[i]) {
          min=v[i];
        }
      }
      return (min);
    }

    double method2(double[] verteces){
      double l;
      l=verteces[0];
      for (int i=0; i < verteces.length; i++) {
        if (verteces[i] < l) {
          l=verteces[i];
        }
      }
      return l;
    }
}
