package all;

public class ClonePair1998 {

    boolean method1(byte[] key,byte[] prefix){
      if (key.length >= prefix.length) {
        for (int i=0; i < prefix.length; i++)     if (key[i] != prefix[i])     return false;
        return true;
      }
      return false;
    }

    boolean method2(byte[] array,byte[] prefix){
      if (prefix.length > array.length) {
        return false;
      }
      for (int i=0; i < prefix.length; i++) {
        if (array[i] != prefix[i]) {
          return false;
        }
      }
      return true;
    }
}
