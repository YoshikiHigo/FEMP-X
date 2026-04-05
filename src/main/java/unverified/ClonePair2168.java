package unverified;

public class ClonePair2168 {

    boolean method1(byte[] bytes,byte[] prefix){
      if (prefix.length > bytes.length)   return false;
      for (int i=0, n=prefix.length; i < n; ++i)   if (bytes[i] != prefix[i])   return false;
      return true;
    }

    boolean method2(byte[] tok,byte[] sub){
      final int sl=sub.length;
      if (sl > tok.length)   return false;
      for (int s=0; s < sl; s++)   if (sub[s] != tok[s])   return false;
      return true;
    }
}
