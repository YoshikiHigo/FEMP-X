package all;

public class ClonePair1222 {

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
      if (null == a) {
        if (null == b)     return true;
     else     return false;
      }
     else   if (null == b)   return false;
     else {
        if (a.length == b.length) {
          for (int cc=0, count=a.length; cc < count; cc++) {
            if (a[cc] != b[cc])         return false;
          }
          return true;
        }
     else     return false;
      }
    }
}
