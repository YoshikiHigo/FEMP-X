package all;

public class ClonePair3146 {

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

    float method2(float[] d){
      float dmax=d[0];
      for (int i=0; i < d.length; i++)   if (d[i] > dmax)   dmax=d[i];
      return dmax;
    }
}
