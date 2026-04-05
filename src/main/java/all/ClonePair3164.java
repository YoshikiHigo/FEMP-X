package all;

public class ClonePair3164 {

    float method1(float[] a){
      float min=a[0];
      for (int i=0; i < a.length; i++) {
        if (min > a[i]) {
          min=a[i];
        }
      }
      return min;
    }

    float method2(float[] d){
      float dmin=d[0];
      for (int i=0; i < d.length; i++)   if (d[i] < dmin)   dmin=d[i];
      return dmin;
    }
}
