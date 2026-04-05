package unverified;

public class ClonePair3133 {

    float method1(float[] tab){
      float max=tab[0];
      for (int i=0; i < tab.length; i++) {
        if (tab[i] > max)     max=tab[i];
      }
      return max;
    }

    float method2(float[] chan){
      float v=chan[0];
      for (int i=0; i < chan.length; i++)   v=Math.max(v,chan[i]);
      return v;
    }
}
