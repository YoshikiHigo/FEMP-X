package unverified;

public class ClonePair2790 {

    boolean method1(byte[] p_source,byte[] p_destination){
      if ((null == p_source) || (null == p_destination) || (p_source.length != p_destination.length))   return false;
      for (int i=0; i < p_source.length; i++)   if (p_destination[i] != p_source[i])   return false;
      return true;
    }

    boolean method2(byte[] b1,byte[] b2){
      if (b1 == null || b2 == null) {
        return false;
      }
      if (b1.length == b2.length) {
        int i=0;
        int j=0;
        int n=b1.length;
        while (n-- != 0) {
          if (b1[i++] != b2[j++]) {
            return false;
          }
        }
        return true;
      }
      return false;
    }
}
