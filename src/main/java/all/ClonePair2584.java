package all;

public class ClonePair2584 {

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

    boolean method2(byte[] first,byte[] second){
      boolean equal=first.length == second.length;
      for (int i=0; i < first.length && equal; i++) {
        equal=first[i] == second[i];
      }
      return equal;
    }
}
