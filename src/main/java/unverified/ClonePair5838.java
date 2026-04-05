package unverified;

public class ClonePair5838 {

    boolean method1(byte[] buf1,int off1,byte[] buf2,int off2,int len){
      if ((off1 + len > buf1.length) || (off2 + len > buf2.length)) {
        return (false);
      }
      for (int i=0; i < len; i++) {
        if (buf1[off1 + i] != buf2[off2 + i]) {
          return (false);
        }
      }
      return (true);
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
