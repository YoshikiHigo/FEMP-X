package all;

public class ClonePair2164 {

    boolean method1(byte[] target,byte[] prefix){
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
