package all;

public class ClonePair2406 {

    boolean method1(byte[] a,byte[] b){
      if (a.length != b.length) {
        return false;
      }
      for (int i=0; i != a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] bcommand,byte[] brecieved){
      if (bcommand.length == brecieved.length) {
        for (int i=0; i < bcommand.length; i++) {
          if (bcommand[i] != brecieved[i]) {
            return false;
          }
        }
        return true;
      }
     else {
        return false;
      }
    }
}
