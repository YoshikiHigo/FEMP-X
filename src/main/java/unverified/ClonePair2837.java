package unverified;

public class ClonePair2837 {

    boolean method1(byte[] a,byte[] b){
      int size;
      if ((size=a.length) != b.length)   return false;
      for (int i=0; i < size; i++)   if (a[i] != b[i])   return false;
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      int size;
      if ((size=a.length) != b.length) {
        return false;
      }
      for (int i=0; i < size; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
