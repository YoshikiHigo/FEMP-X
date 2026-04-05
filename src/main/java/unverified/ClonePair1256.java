package unverified;

public class ClonePair1256 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == b2)   return true;
      if (b1 == null || b2 == null)   return false;
      int length=b1.length;
      if (length != b2.length)   return false;
      for (int index=0; index < length; index++) {
        if (!(b1[index] == b2[index]))     return false;
      }
      return true;
    }

    boolean method2(byte[] bytesA,byte[] bytesB){
      if (bytesA == bytesB) {
        return true;
      }
      if (bytesA == null || bytesB == null) {
        return false;
      }
      if (bytesA.length != bytesB.length) {
        return false;
      }
      for (int i=0; i < bytesA.length; i++) {
        if (bytesA[i] != bytesB[i])     return false;
      }
      return true;
    }
}
