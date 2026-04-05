package all;

public class ClonePair2007 {

    boolean method1(byte[] key,byte[] prefix){
      if (key.length >= prefix.length) {
        for (int i=0; i < prefix.length; i++)     if (key[i] != prefix[i])     return false;
        return true;
      }
      return false;
    }

    boolean method2(byte[] tok,byte[] sub){
      final int sl=sub.length;
      if (sl > tok.length)   return false;
      for (int s=0; s < sl; s++)   if (sub[s] != tok[s])   return false;
      return true;
    }
}
