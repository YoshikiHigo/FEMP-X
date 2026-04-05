package unverified;

public class ClonePair441 {

    boolean method1(byte[] a,byte[] b){
      if (a.length == b.length) {
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i])       return false;
        }
        return true;
      }
      return false;
    }

    boolean method2(byte[] a,byte[] b){
      for (int i=0; i < a.length && i < b.length; i++)   if (a[i] != b[i])   return false;
      return a.length == b.length;
    }
}
