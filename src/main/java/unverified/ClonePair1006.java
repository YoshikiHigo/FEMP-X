package unverified;

public class ClonePair1006 {

    boolean method1(byte[] a,byte[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] o1,byte[] o2){
      if (o1.length != o2.length) {
        return false;
      }
     else {
        for (int i=0; i < o1.length; i++) {
          if (o1[i] != o2[i]) {
            return false;
          }
        }
        return true;
      }
    }
}
