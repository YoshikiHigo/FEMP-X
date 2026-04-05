package all;

public class ClonePair8374 {

    boolean method1(byte[] d1,byte[] d2,int o){
      for (int i=0; i < d1.length; i++) {
        if (i + o >= d2.length)     return false;
        if (d1[i] != d2[o + i])     return false;
      }
      return true;
    }

    boolean method2(byte[] pat,byte[] in,int idx){
      if ((idx + pat.length) > in.length)   return false;
      for (int i=0; i < pat.length; i++)   if (pat[i] != in[i + idx])   return false;
     else   ;
      return true;
    }
}
