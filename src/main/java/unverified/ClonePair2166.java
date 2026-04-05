package unverified;

public class ClonePair2166 {

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

    boolean method2(byte[] string,byte[] start){
      if (string.length < start.length)   return false;
      for (int i=0; i < start.length; i++) {
        if (string[i] != start[i])     return false;
      }
      return true;
    }
}
