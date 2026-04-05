package unverified;

public class ClonePair889 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1.length != b2.length) {
        System.out.println("Compare failed: lengths differ");
        return false;
      }
      for (int i=0; i < b1.length; i++) {
        if (b1[i] != b2[i]) {
          System.out.println("Compare failed: bytes at " + i + " differ ["+ b1[i]+ "] ["+ b2[i]+ "]");
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      boolean v=a.length == b.length;
      for (int i=0; i < a.length && v; i++) {
        if (a[i] != b[i])     v=false;
      }
      return v;
    }
}
