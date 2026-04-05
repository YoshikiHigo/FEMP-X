package all;

public class ClonePair2793 {

    boolean method1(byte[] p_source,byte[] p_destination){
      if ((null == p_source) || (null == p_destination) || (p_source.length != p_destination.length))   return false;
      for (int i=0; i < p_source.length; i++)   if (p_destination[i] != p_source[i])   return false;
      return true;
    }

    boolean method2(byte[] one,byte[] two){
      if ((one == null) || (two == null)) {
        return false;
      }
      if (one.length != two.length) {
        return false;
      }
      int length=one.length;
      int byteCount=0;
      while (byteCount < length) {
        if (one[byteCount] != two[byteCount]) {
          return false;
        }
        ++byteCount;
      }
      return true;
    }
}
