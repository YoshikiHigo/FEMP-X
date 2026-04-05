package all;

public class ClonePair3135 {

    float method1(float[] tab){
      float max=tab[0];
      for (int i=0; i < tab.length; i++) {
        if (tab[i] > max)     max=tab[i];
      }
      return max;
    }

    float method2(float[] d){
      float dmax=d[0];
      for (int i=0; i < d.length; i++)   if (d[i] > dmax)   dmax=d[i];
      return dmax;
    }
}
