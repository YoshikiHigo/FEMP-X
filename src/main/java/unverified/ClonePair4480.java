package unverified;

public class ClonePair4480 {

    double method1(double[] arrFunc){
      double dblMax=arrFunc[0];
      for (int index=0; index < arrFunc.length; index++)   if (arrFunc[index] > dblMax) {
        dblMax=arrFunc[index];
      }
      return dblMax;
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
