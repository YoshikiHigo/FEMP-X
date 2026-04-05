package unverified;

public class ClonePair1720 {

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
