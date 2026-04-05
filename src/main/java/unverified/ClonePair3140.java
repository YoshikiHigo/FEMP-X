package unverified;

public class ClonePair3140 {

    float method1(float[] chan){
      float v=chan[0];
      for (int i=0; i < chan.length; i++)   v=Math.min(v,chan[i]);
      return v;
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
