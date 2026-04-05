package all;

public class ClonePair3160 {

    float method1(float[] f){
      float lowest=f[0];
      for (int i=1; i < f.length; i++) {
        if (f[i] < lowest) {
          lowest=f[i];
        }
      }
      return lowest;
    }

    float method2(float[] a){
      float min=a[0];
      for (int i=0; i < a.length; i++) {
        if (min > a[i]) {
          min=a[i];
        }
      }
      return min;
    }
}
