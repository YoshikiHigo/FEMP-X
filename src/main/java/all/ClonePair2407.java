package all;

public class ClonePair2407 {

    boolean method1(byte[] a,byte[] b){
      if (a.length != b.length) {
        return false;
      }
      for (int i=0; i != a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      for (int i=0; i < a.length && i < b.length; i++)   if (a[i] != b[i])   return false;
      return a.length == b.length;
    }
}
