package unverified;

public class ClonePair3143 {

    float method1(float[] chan){
      float v=chan[0];
      for (int i=0; i < chan.length; i++)   v=Math.min(v,chan[i]);
      return v;
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
