package unverified;

public class ClonePair1491 {

    boolean method1(byte[] key1,byte[] key2){
      if (key1 == null)   return (key2 == null);
      if (key2 == null)   return false;
      if (key1.length != key2.length)   return false;
      for (int i=0; i < key1.length; i++)   if (key1[i] != key2[i])   return false;
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
