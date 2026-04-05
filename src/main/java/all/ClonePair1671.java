package all;

public class ClonePair1671 {

    boolean method1(byte[] a,byte[] b){
      if (null == a)   return (null == b);
     else   if (null == b)   return false;
     else   if (a.length == b.length) {
        for (int cc=0, count=a.length; cc < count; cc++) {
          if (a[cc] != b[cc])       return false;
        }
        return true;
      }
     else   return false;
    }

    boolean method2(byte[] a,byte[] b){
      if (a == null)   return b == null;
     else   if (b == null)   return false;
     else   if (b.length <= 0)   return a.length <= 0;
      byte diff=(byte)((a.length == b.length) ? 0 : 1);
      int j=0;
      for (int i=0; i < a.length; ++i) {
        diff|=a[i] ^ b[j];
        j=(j + 1) % b.length;
      }
      return diff == 0;
    }
}
