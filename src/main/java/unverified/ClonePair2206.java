package unverified;

public class ClonePair2206 {

    boolean method1(byte[] data1,byte[] data2){
      if (data1 == data2)   return true;
      if (data1 == null || data2 == null)   return false;
      if (data1.length != data2.length)   return false;
      for (int i=0; i < data1.length; i++) {
        if (data1[i] != data2[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] a1,byte[] a2){
      if ((a1 == null) || (a2 == null)) {
        return a1 == a2;
      }
      int nLength=a1.length;
      if (nLength != a2.length) {
        return false;
      }
      for (int i=0; i < nLength; i++) {
        if (a1[i] != a2[i]) {
          return false;
        }
      }
      return true;
    }
}
