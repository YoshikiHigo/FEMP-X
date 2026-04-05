package all;

public class ClonePair5808 {

    boolean method1(byte[] a,int aOff,byte[] b,int bOff,int len){
      for (int i=0; i < len; ++i)   if (a[aOff + i] != b[bOff + i])   return false;
      return true;
    }

    boolean method2(byte[] b1,int off1,byte[] b2,int off2,int len){
      if (b1 == b2 && off1 == off2) {
        return true;
      }
      for (int i=0; i < len; i++) {
        if (b1[off1 + i] != b2[off2 + i]) {
          return false;
        }
      }
      return true;
    }
}
