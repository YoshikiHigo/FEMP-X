package all;

public class ClonePair5805 {

    boolean method1(byte[] a,int aOff,byte[] b,int bOff,int len){
      for (int i=0; i < len; ++i)   if (a[aOff + i] != b[bOff + i])   return false;
      return true;
    }

    boolean method2(byte[] b1,int offset1,byte[] b2,int offset2,int length){
      for (int i=0; i < length; i++) {
        if (b1[i + offset1] != b2[i + offset2]) {
          return false;
        }
      }
      return true;
    }
}
