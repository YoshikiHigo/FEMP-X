package all;

public class ClonePair249 {

    boolean method1(byte[] a,byte[] b){
      int alength=(a == null) ? 0 : a.length;
      int blength=(b == null) ? 0 : b.length;
      if (alength != blength) {
        return false;
      }
      for (int i=0; i < alength; ++i) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] cksum1,byte[] cksum2){
      if (cksum1 == cksum2)   return true;
      if ((cksum1 == null && cksum2 != null) || (cksum1 != null && cksum2 == null))   return false;
      if (cksum1.length != cksum2.length)   return false;
      for (int i=0; i < cksum1.length; i++)   if (cksum1[i] != cksum2[i])   return false;
      return true;
    }
}
