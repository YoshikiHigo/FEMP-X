package unverified;

public class ClonePair3136 {

    float method1(float[] tab){
      float max=tab[0];
      for (int i=0; i < tab.length; i++) {
        if (tab[i] > max)     max=tab[i];
      }
      return max;
    }

    float method2(float[] f){
      float highest=f[0];
      for (int i=1; i < f.length; i++) {
        if (f[i] > highest) {
          highest=f[i];
        }
      }
      return highest;
    }
}
