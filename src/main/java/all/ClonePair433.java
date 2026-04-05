package all;

public class ClonePair433 {

    boolean method1(byte[] a,byte[] b){
      if (a.length == b.length) {
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i])       return false;
        }
        return true;
      }
      return false;
    }

    boolean method2(byte[] d1,byte[] d2){
      if (d1.length != d2.length) {
        return false;
      }
      for (int i=0; i < d1.length; i++) {
        if (d1[i] != d2[i])     return false;
      }
      return true;
    }
}
