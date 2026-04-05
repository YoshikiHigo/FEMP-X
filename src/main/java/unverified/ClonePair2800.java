package unverified;

public class ClonePair2800 {

    boolean method1(byte[] a,byte[] b){
      if (a == null || b == null)   return false;
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++)   if (a[i] != b[i])   return false;
      return true;
    }

    boolean method2(byte[] one,byte[] two){
      if ((one == null) || (two == null)) {
        return false;
      }
      if (one.length != two.length) {
        return false;
      }
      int length=one.length;
      int byteCount=0;
      while (byteCount < length) {
        if (one[byteCount] != two[byteCount]) {
          return false;
        }
        ++byteCount;
      }
      return true;
    }
}
