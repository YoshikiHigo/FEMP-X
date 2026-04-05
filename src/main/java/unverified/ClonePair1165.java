package unverified;

public class ClonePair1165 {

    boolean method1(byte[] checkMe,byte[] maybePrefix){
      int cm_len=checkMe.length;
      int mp_len=maybePrefix.length;
      if (cm_len < mp_len)   return false;
      for (int i=0; i < mp_len; ++i)   if (checkMe[i] != maybePrefix[i])   return false;
      return true;
    }

    boolean method2(byte[] tok,byte[] sub){
      final int sl=sub.length;
      if (sl > tok.length)   return false;
      for (int s=0; s < sl; s++)   if (sub[s] != tok[s])   return false;
      return true;
    }
}
