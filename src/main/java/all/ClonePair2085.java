package all;

public class ClonePair2085 {

    boolean method1(byte[] array,byte[] prefix){
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
