package unverified;

public class ClonePair3147 {

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
