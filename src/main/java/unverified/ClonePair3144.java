package unverified;

public class ClonePair3144 {

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

    float method2(float[] data){
      float max=data[0];
      for (int i=1; i < data.length; ++i)   if (data[i] > max)   max=data[i];
      return max;
    }
}
