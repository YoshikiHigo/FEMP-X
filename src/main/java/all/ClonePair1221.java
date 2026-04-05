package all;

public class ClonePair1221 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 != null) {
        if (b2 != null) {
          if (b1.length == b2.length) {
            boolean flag=true;
            for (int i=0; i < b1.length; i++) {
              if (b1[i] != b2[i]) {
                flag=false;
                break;
              }
            }
            return flag;
          }
     else {
            return false;
          }
        }
     else {
          return false;
        }
      }
     else {
        if (b2 == null) {
          return true;
        }
     else {
          return false;
        }
      }
    }

    boolean method2(byte[] a,byte[] b){
      if (a == null) {
        return b == null;
      }
      if (b == null) {
        return false;
      }
      if (a.length != b.length) {
        return false;
      }
      for (int i=a.length - 1; i >= 0; i--) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
