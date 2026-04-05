package all;

public class ClonePair1149 {

    boolean method1(byte[] a1,byte[] a2){
      if (a1 == a2)   return true;
      if (null == a1 || null == a2)   return false;
      if (a1.length == a2.length) {
        int i=a1.length;
        while (--i >= 0)     if (a1[i] != a2[i])     return false;
        return true;
      }
      return false;
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
