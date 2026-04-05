package all;

public class ClonePair3154 {

    float method1(float[] tab){
      float min=tab[0];
      for (int i=0; i < tab.length; i++) {
        if (tab[i] < min)     min=tab[i];
      }
      return min;
    }

    float method2(float[] f){
      float lowest=f[0];
      for (int i=1; i < f.length; i++) {
        if (f[i] < lowest) {
          lowest=f[i];
        }
      }
      return lowest;
    }
}
