package unverified;

public class ClonePair5841 {

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

    boolean method2(byte[] a,int i,byte[] b,int j,int n){
      if (a.length < i + n || b.length < j + n)   return false;
      while (--n >= 0)   if (a[i++] != b[j++])   return false;
      return true;
    }
}
