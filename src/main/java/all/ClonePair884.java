package all;

public class ClonePair884 {

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
