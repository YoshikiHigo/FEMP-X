package all;

public class ClonePair2792 {

    boolean method1(byte[] p_source,byte[] p_destination){
      if ((null == p_source) || (null == p_destination) || (p_source.length != p_destination.length))   return false;
      for (int i=0; i < p_source.length; i++)   if (p_destination[i] != p_source[i])   return false;
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      if (a == null || b == null) {
        return false;
      }
      int aLength=a.length;
      if (aLength != b.length) {
        return false;
      }
      for (int i=0; i < aLength; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
