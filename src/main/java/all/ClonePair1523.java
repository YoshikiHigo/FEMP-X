package all;

public class ClonePair1523 {

    boolean method1(byte[] key1,byte[] key2){
      if (key1 == null)   return (key2 == null);
      if (key2 == null)   return false;
      if (key1.length != key2.length)   return false;
      for (int i=0; i < key1.length; i++)   if (key1[i] != key2[i])   return false;
      return true;
    }

    boolean method2(byte[] lhs,byte[] rhs){
      if (lhs == null && rhs != null || lhs != null && rhs == null) {
        return false;
      }
      if (lhs == rhs) {
        return true;
      }
      if (lhs.length != rhs.length) {
        return false;
      }
      for (int i=0; i < lhs.length; i++) {
        if (lhs[i] != rhs[i]) {
          return false;
        }
      }
      return true;
    }
}
