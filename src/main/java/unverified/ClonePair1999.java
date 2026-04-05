package unverified;

public class ClonePair1999 {

    boolean method1(byte[] key,byte[] prefix){
      if (key.length >= prefix.length) {
        for (int i=0; i < prefix.length; i++)     if (key[i] != prefix[i])     return false;
        return true;
      }
      return false;
    }

    boolean method2(byte[] target,byte[] prefix){
      final int testlen=prefix.length;
      if (target.length < testlen) {
        return false;
      }
      for (int i=0; i < testlen; i++) {
        if (target[i] != prefix[i]) {
          return false;
        }
      }
      return true;
    }
}
