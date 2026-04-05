package all;

public class ClonePair708 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == null && b2 == null)   return true;
      if (b1 == null || b2 == null || b1.length != b2.length)   return false;
      for (int c=0; c < b1.length; c++) {
        if (b1[c] != b2[c])     return false;
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
