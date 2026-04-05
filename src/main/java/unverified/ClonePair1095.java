package unverified;

public class ClonePair1095 {

    boolean method1(byte[] tok,byte[] tok2){
      final int tl=tok2.length;
      if (tl != tok.length)   return false;
      for (int t=0; t != tl; t++)   if (tok2[t] != tok[t])   return false;
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      int size;
      if ((size=a.length) != b.length)   return false;
      for (int i=0; i < size; i++)   if (a[i] != b[i])   return false;
      return true;
    }
}
