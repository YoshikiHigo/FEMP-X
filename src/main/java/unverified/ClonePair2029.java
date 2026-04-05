package unverified;

public class ClonePair2029 {

    boolean method1(byte[] a,byte[] b){
      boolean v=a.length == b.length;
      for (int i=0; i < a.length && v; i++) {
        if (a[i] != b[i])     v=false;
      }
      return v;
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
