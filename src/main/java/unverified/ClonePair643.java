package unverified;

public class ClonePair643 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1.length == b2.length) {
        for (int ii=0; ii < b1.length; ++ii) {
          if (b1[ii] != b2[ii]) {
            return false;
          }
        }
        return true;
      }
      return false;
    }

    boolean method2(byte[] a,byte[] b){
      int size;
      if ((size=a.length) != b.length)   return false;
      for (int i=0; i < size; i++)   if (a[i] != b[i])   return false;
      return true;
    }
}
