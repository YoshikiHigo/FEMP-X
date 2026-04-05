package unverified;

public class ClonePair3145 {

    float method1(float[] a){
      float res=a[0];
      float buff;
      for (int i=1; i < a.length; i++) {
        buff=a[i];
        if (buff > res) {
          res=buff;
        }
      }
      return res;
    }

    float method2(float[] chan){
      float v=chan[0];
      for (int i=0; i < chan.length; i++)   v=Math.max(v,chan[i]);
      return v;
    }
}
