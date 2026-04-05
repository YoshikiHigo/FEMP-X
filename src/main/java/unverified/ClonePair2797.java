package unverified;

public class ClonePair2797 {

    boolean method1(byte[] a,byte[] b){
      if (a == null || b == null)   return false;
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++)   if (a[i] != b[i])   return false;
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      if (a == null || b == null) {
        return false;
      }
      int aLength=a.length;
      if (aLength != b.length) {
        return false;
      }
      for (int i=0; i < aLength; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
