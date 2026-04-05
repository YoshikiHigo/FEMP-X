package unverified;

public class ClonePair3156 {

    float method1(float[] tab){
      float min=tab[0];
      for (int i=0; i < tab.length; i++) {
        if (tab[i] < min)     min=tab[i];
      }
      return min;
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
