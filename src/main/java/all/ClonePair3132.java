package all;

public class ClonePair3132 {

    float method1(float[] tab){
      float max=tab[0];
      for (int i=0; i < tab.length; i++) {
        if (tab[i] > max)     max=tab[i];
      }
      return max;
    }

    float method2(float[] a){
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
}
