package unverified;

public class ClonePair2860 {

    boolean method1(byte[] b1,byte[] b2){
      boolean ret=false;
      if (b1.length == b2.length) {
        ret=true;
        for (int i=0; i < b1.length && ret; i++) {
          if (b1[i] != b2[i])       ret=false;
        }
      }
      return ret;
    }

    boolean method2(byte[] a,byte[] b){
      if (a.length != b.length)   return false;
      int len=a.length;
      for (int i=0; i < len; i++) {
        if (a[i] != b[i])     return false;
      }
      return true;
    }
}
