package all;

public class ClonePair1161 {

    boolean method1(byte[] checkMe,byte[] maybePrefix){
      int cm_len=checkMe.length;
      int mp_len=maybePrefix.length;
      if (cm_len < mp_len)   return false;
      for (int i=0; i < mp_len; ++i)   if (checkMe[i] != maybePrefix[i])   return false;
      return true;
    }

    boolean method2(byte[] bytes,byte[] prefix){
      if (prefix.length > bytes.length)   return false;
      for (int i=0, n=prefix.length; i < n; ++i)   if (bytes[i] != prefix[i])   return false;
      return true;
    }
}
