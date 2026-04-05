package unverified;

public class ClonePair2580 {

    boolean method1(byte[] bcommand,byte[] brecieved){
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

    boolean method2(byte[] b1,byte[] b2){
      if (b1.length != b2.length)   return false;
      for (int i=0; i < b2.length; i++) {
        byte b=b2[i];
        if (b != b1[i])     return false;
      }
      return true;
    }
}
