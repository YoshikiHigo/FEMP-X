package all;

public class ClonePair3228 {

    boolean method1(int[] a,int[] b){
      if (a.length != b.length) {
        return (false);
      }
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return (false);
        }
      }
      return (true);
    }

    boolean method2(int[] mark1,int[] mark2){
      int m1=mark1.length;
      int m2=mark2.length;
      if (m1 != m2) {
        return false;
      }
     else {
        for (int i=0; i < m1; i++) {
          if ((int)(mark1[i]) != (int)(mark2[i])) {
            return false;
          }
        }
      }
      return true;
    }
}
