package unverified;

public class ClonePair1252 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == b2)   return true;
      if (b1 == null || b2 == null)   return false;
      int length=b1.length;
      if (length != b2.length)   return false;
      for (int index=0; index < length; index++) {
        if (!(b1[index] == b2[index]))     return false;
      }
      return true;
    }

    boolean method2(byte[] key1,byte[] key2){
      if (key1 == null)   return (key2 == null);
      if (key2 == null)   return false;
      if (key1.length != key2.length)   return false;
      for (int i=0; i < key1.length; i++)   if (key1[i] != key2[i])   return false;
      return true;
    }
}
