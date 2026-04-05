package unverified;

public class ClonePair152 {

    boolean method1(byte[] a,byte[] b){
      int len=a.length;
      if (len != b.length) {
        return false;
      }
      for (int i=0; i < len; ++i) {
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
