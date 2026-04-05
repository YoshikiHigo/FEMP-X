package all;

public class ClonePair3153 {

    float method1(float[] chan){
      float v=chan[0];
      for (int i=0; i < chan.length; i++)   v=Math.max(v,chan[i]);
      return v;
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
