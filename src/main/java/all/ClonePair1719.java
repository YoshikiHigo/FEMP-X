package all;

public class ClonePair1719 {

    boolean method1(byte[] bytes,byte[] lookFor){
      if (bytes.length < lookFor.length) {
        return false;
      }
      for (int i=0; i < lookFor.length; ++i) {
        if (bytes[i] != lookFor[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] key,byte[] prefix){
      if (key.length >= prefix.length) {
        for (int i=0; i < prefix.length; i++)     if (key[i] != prefix[i])     return false;
        return true;
      }
      return false;
    }
}
