package unverified;

public class ClonePair1056 {

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

    boolean method2(byte[] p_source,byte[] p_destination){
      if ((null == p_source) || (null == p_destination) || (p_source.length != p_destination.length))   return false;
      for (int i=0; i < p_source.length; i++)   if (p_destination[i] != p_source[i])   return false;
      return true;
    }
}
