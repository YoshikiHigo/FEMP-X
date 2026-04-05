package all;

public class ClonePair1166 {

    boolean method1(byte[] checkMe,byte[] maybePrefix){
      int cm_len=checkMe.length;
      int mp_len=maybePrefix.length;
      if (cm_len < mp_len)   return false;
      for (int i=0; i < mp_len; ++i)   if (checkMe[i] != maybePrefix[i])   return false;
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
