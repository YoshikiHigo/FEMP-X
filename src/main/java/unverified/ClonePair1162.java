package unverified;

public class ClonePair1162 {

    boolean method1(byte[] checkMe,byte[] maybePrefix){
      int cm_len=checkMe.length;
      int mp_len=maybePrefix.length;
      if (cm_len < mp_len)   return false;
      for (int i=0; i < mp_len; ++i)   if (checkMe[i] != maybePrefix[i])   return false;
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
