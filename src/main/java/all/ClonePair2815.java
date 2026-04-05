package all;

public class ClonePair2815 {

    boolean method1(byte[] a,byte[] b){
      if (a == b)   return true;
      if ((a == null) || (b == null))   return false;
      int i=a.length;
      if (b.length != i)   return false;
      while (--i >= 0)   if (a[i] != b[i])   return false;
      return true;
    }

    boolean method2(byte[] val1,byte[] val2){
      boolean more;
      int i;
      if (val1 == null && val2 == null) {
        return true;
      }
      more=val1 != null && val2 != null && val1.length == val2.length;
      for (i=0; more && i < val1.length; i++) {
        more=val1[i] == val2[i];
      }
      return more;
    }
}
