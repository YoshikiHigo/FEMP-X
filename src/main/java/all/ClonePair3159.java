package all;

public class ClonePair3159 {

    float method1(float[] f){
      float lowest=f[0];
      for (int i=1; i < f.length; i++) {
        if (f[i] < lowest) {
          lowest=f[i];
        }
      }
      return lowest;
    }

    float method2(float[] d){
      float dmin=d[0];
      for (int i=0; i < d.length; i++)   if (d[i] < dmin)   dmin=d[i];
      return dmin;
    }
}
