package unverified;

public class ClonePair169 {

    boolean method1(byte[] a,byte[] b){
      int len=a.length;
      if (len != b.length) {
        return false;
      }
      for (int i=0; i < len; ++i) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      int aLength=a.length;
      if (aLength != b.length)   return false;
      for (int i=0; i < aLength; i++)   if (a[i] != b[i])   return false;
      return true;
    }
}
