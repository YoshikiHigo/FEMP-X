package all;

public class ClonePair1506 {

    boolean method1(byte[] key1,byte[] key2){
      if (key1 == null)   return (key2 == null);
      if (key2 == null)   return false;
      if (key1.length != key2.length)   return false;
      for (int i=0; i < key1.length; i++)   if (key1[i] != key2[i])   return false;
      return true;
    }

    boolean method2(byte[] b1,byte[] b2){
      if (b1 == null || b2 == null) {
        return b1 == b2;
      }
      if (b1.length != b2.length) {
        return false;
      }
      for (int i=0; i < b1.length; i++) {
        if (b1[i] != b2[i]) {
          return false;
        }
      }
      return true;
    }
}
