package all;

public class ClonePair2583 {

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

    boolean method2(byte[] arr1,byte[] arr2){
      if (arr1.length == arr2.length) {
        for (int i=0; i < arr1.length; i++) {
          if (arr1[i] != arr2[i])       return false;
        }
      }
     else {
        return false;
      }
      return true;
    }
}
