package all;

public class ClonePair2167 {

    boolean method1(byte[] bytes,byte[] prefix){
      if (prefix.length > bytes.length)   return false;
      for (int i=0, n=prefix.length; i < n; ++i)   if (bytes[i] != prefix[i])   return false;
      return true;
    }

    boolean method2(byte[] bytes,byte[] magicNumber){
      if (bytes.length < magicNumber.length) {
        return false;
      }
      for (int i=0; i < magicNumber.length; i++) {
        if (bytes[i] != magicNumber[i]) {
          return false;
        }
      }
      return true;
    }
}
