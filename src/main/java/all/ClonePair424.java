package all;

public class ClonePair424 {

    boolean method1(byte[] a,byte[] b){
      if (a.length == b.length) {
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i])       return false;
        }
        return true;
      }
      return false;
    }

    boolean method2(byte[] b1,byte[] b2){
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
}
