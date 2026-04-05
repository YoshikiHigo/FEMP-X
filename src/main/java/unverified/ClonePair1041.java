package unverified;

public class ClonePair1041 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == null || b2 == null || b1.length != b2.length) {
        return false;
      }
      for (int i=0; i < b1.length; i++) {
        if (b1[i] != b2[i]) {
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
