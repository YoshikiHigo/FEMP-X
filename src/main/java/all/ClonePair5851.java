package all;

public class ClonePair5851 {

    boolean method1(byte[] a,int aOff,byte[] b,int bOff,int len){
      if ((a.length < aOff + len) || (b.length < bOff + len))   return false;
      for (int i=0; i < len; i++) {
        if (a[i + aOff] != b[i + bOff])     return false;
      }
      return true;
    }

    boolean method2(byte[] a,int aOffset,byte[] b,int bOffset,int length){
      if ((a.length < aOffset + length) || (b.length < bOffset + length)) {
        return false;
      }
      for (int i=0; i < length; i++) {
        if (a[aOffset + i] != b[bOffset + i]) {
          return false;
        }
      }
      return true;
    }
}
