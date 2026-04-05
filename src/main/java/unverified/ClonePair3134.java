package unverified;

public class ClonePair3134 {

    float method1(float[] tab){
      float max=tab[0];
      for (int i=0; i < tab.length; i++) {
        if (tab[i] > max)     max=tab[i];
      }
      return max;
    }

    float method2(float[] data){
      float max=data[0];
      for (int i=1; i < data.length; ++i)   if (data[i] > max)   max=data[i];
      return max;
    }
}
