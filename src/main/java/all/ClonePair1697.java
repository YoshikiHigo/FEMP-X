package all;

public class ClonePair1697 {

    boolean method1(byte[] x,byte[] y){
      if (x == null || y == null)   return false;
      if (x.length != y.length)   return false;
      for (int i=0; i < x.length; i++) {
        if (x[i] != y[i]) {
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
