package unverified;

public class ClonePair2225 {

    boolean method1(byte[] bytea,byte[] byteb){
      boolean equal=true;
      if (bytea.length == byteb.length) {
        for (int i=0; i < bytea.length; i++) {
          if (bytea[i] != byteb[i]) {
            equal=false;
            break;
          }
        }
      }
     else {
        equal=false;
      }
      return equal;
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
