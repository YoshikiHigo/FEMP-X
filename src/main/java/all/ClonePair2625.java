package all;

public class ClonePair2625 {

    boolean method1(byte[] a,byte[] b){
      for (int i=0; i < a.length && i < b.length; i++)   if (a[i] != b[i])   return false;
      return a.length == b.length;
    }

    boolean method2(byte[] b1,byte[] b2){
      if (b1.length != b2.length)   return false;
      for (int i=b1.length; --i >= 0; ) {
        if (b1[i] != b2[i])     return false;
      }
      return true;
    }
}
