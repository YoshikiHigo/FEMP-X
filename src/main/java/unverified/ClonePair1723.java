package unverified;

public class ClonePair1723 {

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
