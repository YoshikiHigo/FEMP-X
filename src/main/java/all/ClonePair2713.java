package all;

public class ClonePair2713 {

    boolean method1(byte[] a,byte[] b){
      int aLength=a.length;
      if (aLength != b.length)   return false;
      for (int i=0; i < aLength; i++)   if (a[i] != b[i])   return false;
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      if (a.length != b.length)   return false;
      int len=a.length;
      for (int i=0; i < len; i++) {
        if (a[i] != b[i])     return false;
      }
      return true;
    }
}
