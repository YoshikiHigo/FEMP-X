package unverified;

public class ClonePair2088 {

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

    boolean method2(byte[] tok,byte[] sub){
      final int sl=sub.length;
      if (sl > tok.length)   return false;
      for (int s=0; s < sl; s++)   if (sub[s] != tok[s])   return false;
      return true;
    }
}
