package all;

public class ClonePair3157 {

    float method1(float[] tab){
      float min=tab[0];
      for (int i=0; i < tab.length; i++) {
        if (tab[i] < min)     min=tab[i];
      }
      return min;
    }

    float method2(float[] d){
      float dmin=d[0];
      for (int i=0; i < d.length; i++)   if (d[i] < dmin)   dmin=d[i];
      return dmin;
    }
}
