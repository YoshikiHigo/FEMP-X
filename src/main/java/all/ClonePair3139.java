package all;

public class ClonePair3139 {

    float method1(float[] chan){
      float v=chan[0];
      for (int i=0; i < chan.length; i++)   v=Math.min(v,chan[i]);
      return v;
    }

    float method2(float[] tab){
      float min=tab[0];
      for (int i=0; i < tab.length; i++) {
        if (tab[i] < min)     min=tab[i];
      }
      return min;
    }
}
