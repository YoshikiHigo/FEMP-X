package unverified;

public class ClonePair5850 {

    boolean method1(byte[] a,int aOff,byte[] b,int bOff,int len){
      if ((a.length < aOff + len) || (b.length < bOff + len))   return false;
      for (int i=0; i < len; i++) {
        if (a[i + aOff] != b[i + bOff])     return false;
      }
      return true;
    }

    boolean method2(byte[] buf1,int off1,byte[] buf2,int off2,int len){
      if ((off1 + len > buf1.length) || (off2 + len > buf2.length)) {
        return false;
      }
      for (int i=0; i < len; i++) {
        if (buf1[off1 + i] != buf2[off2 + i]) {
          return false;
        }
      }
      return true;
    }
}
