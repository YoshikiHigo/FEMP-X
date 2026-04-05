package all;

public class ClonePair4593 {

    double method1(double[] arrFunc){
      double dblMin=arrFunc[0];
      for (int index=0; index < arrFunc.length; index++)   if (arrFunc[index] < dblMin) {
        dblMin=arrFunc[index];
      }
      return dblMin;
    }

    double method2(double[] v){
      double min=v[0];
      for (int i=1; i < v.length; i++) {
        if (min > v[i]) {
          min=v[i];
        }
      }
      return (min);
    }
}
