package unverified;

public class ClonePair1160 {

    boolean method1(byte[] checkMe,byte[] maybePrefix){
      int cm_len=checkMe.length;
      int mp_len=maybePrefix.length;
      if (cm_len < mp_len)   return false;
      for (int i=0; i < mp_len; ++i)   if (checkMe[i] != maybePrefix[i])   return false;
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
