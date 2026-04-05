package unverified;

public class ClonePair4251 {

    boolean method1(float[] distribution1,float[] distribution2){
      if (distribution1.length != distribution2.length) {
        return false;
      }
      for (int i=0; i < distribution1.length; i++) {
        if (distribution1[i] == 0 && distribution2[i] != 0) {
          return false;
        }
        if (distribution1[i] != 0 && distribution1[i] == 0) {
          return false;
        }
      }
      return true;
    }

    boolean method2(float[] a,float[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i])     return false;
      }
      return true;
    }
}
