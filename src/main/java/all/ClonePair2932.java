package all;

public class ClonePair2932 {

    boolean method1(byte[] a,byte[] b){
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

    boolean method2(byte[] b1,byte[] b2){
      if (b1.length != b2.length)   return false;
      for (int i=0; i < b2.length; i++) {
        byte b=b2[i];
        if (b != b1[i])     return false;
      }
      return true;
    }
}
