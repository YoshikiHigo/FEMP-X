package all;

public class ClonePair1729 {

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

    boolean method2(byte[] string,byte[] start){
      if (string.length < start.length)   return false;
      for (int i=0; i < start.length; i++) {
        if (string[i] != start[i])     return false;
      }
      return true;
    }
}
