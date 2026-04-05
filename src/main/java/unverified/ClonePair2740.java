package unverified;

public class ClonePair2740 {

    boolean method1(byte[] x,byte[] y){
      if (x == y) {
        return (true);
      }
      int len=x.length;
      if (len != y.length) {
        return (false);
      }
      for (int i=0; i < len; i++) {
        if (x[i] != y[i]) {
          return (false);
        }
      }
      return (true);
    }

    boolean method2(byte[] b1,byte[] b2){
      boolean ret=false;
      if (b1.length == b2.length) {
        ret=true;
        for (int i=0; i < b1.length && ret; i++) {
          if (b1[i] != b2[i])       ret=false;
        }
      }
      return ret;
    }
}
