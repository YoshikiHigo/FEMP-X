package all;

public class ClonePair582 {

    boolean method1(byte[] test,byte[] good){
      if ((test == null) || (good == null)) {
        return (test == null) && (good == null);
      }
      if (test.length != good.length) {
        return false;
      }
      if (test.length == 0) {
        return true;
      }
      int bits=0;
      for (int i=0; i < good.length; i++) {
        bits|=test[i] ^ good[i];
      }
      return bits == 0;
    }

    boolean method2(byte[] key1,byte[] key2){
      if (key1 == null)   return (key2 == null);
      if (key2 == null)   return false;
      if (key1.length != key2.length)   return false;
      for (int i=0; i < key1.length; i++)   if (key1[i] != key2[i])   return false;
      return true;
    }
}
