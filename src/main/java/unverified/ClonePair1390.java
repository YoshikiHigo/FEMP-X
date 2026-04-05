package unverified;

public class ClonePair1390 {

    boolean method1(byte[] cksum1,byte[] cksum2){
      if (cksum1 == cksum2)   return true;
      if ((cksum1 == null && cksum2 != null) || (cksum1 != null && cksum2 == null))   return false;
      if (cksum1.length != cksum2.length)   return false;
      for (int i=0; i < cksum1.length; i++)   if (cksum1[i] != cksum2[i])   return false;
      return true;
    }

    boolean method2(byte[] bytes1,byte[] bytes2){
      if (bytes1 == null && bytes2 == null) {
        return true;
      }
     else   if (bytes1 == null || bytes2 == null) {
        return false;
      }
      if (bytes1.length != bytes2.length) {
        return false;
      }
      for (int i=0; i < bytes1.length; i++) {
        if (bytes1[i] != bytes2[i]) {
          return false;
        }
      }
      return true;
    }
}
