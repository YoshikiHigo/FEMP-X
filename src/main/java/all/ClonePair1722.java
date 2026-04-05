package all;

public class ClonePair1722 {

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

    boolean method2(byte[] bytes,byte[] prefix){
      if (prefix.length > bytes.length)   return false;
      for (int i=0, n=prefix.length; i < n; ++i)   if (bytes[i] != prefix[i])   return false;
      return true;
    }
}
