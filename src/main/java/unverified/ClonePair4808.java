package unverified;

public class ClonePair4808 {

    double method1(double[] verteces){
      double r;
      r=verteces[0];
      for (int i=0; i < verteces.length; i++) {
        if (verteces[i] > r) {
          r=verteces[i];
        }
      }
      return r;
    }

    double method2(double[] array){
      double max=array[0];
      for (  double d : array)   if (d > max)   max=d;
      return max;
    }
}
