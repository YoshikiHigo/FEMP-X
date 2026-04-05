package all;

public class ClonePair3155 {

    float method1(float[] tab){
      float min=tab[0];
      for (int i=0; i < tab.length; i++) {
        if (tab[i] < min)     min=tab[i];
      }
      return min;
    }

    float method2(float[] data){
      float min=data[0];
      for (int i=1; i < data.length; ++i)   if (data[i] < min)   min=data[i];
      return min;
    }
}
