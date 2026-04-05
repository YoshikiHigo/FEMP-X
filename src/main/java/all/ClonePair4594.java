package all;

public class ClonePair4594 {

    double method1(double[] arrFunc){
      double dblMin=arrFunc[0];
      for (int index=0; index < arrFunc.length; index++)   if (arrFunc[index] < dblMin) {
        dblMin=arrFunc[index];
      }
      return dblMin;
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
