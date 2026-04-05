package all;

public class ClonePair5852 {

    boolean method1(byte[] a,int aOff,byte[] b,int bOff,int len){
      if ((a.length < aOff + len) || (b.length < bOff + len))   return false;
      for (int i=0; i < len; i++) {
        if (a[i + aOff] != b[i + bOff])     return false;
      }
      return true;
    }

    boolean method2(byte[] a,int i,byte[] b,int j,int n){
      if (a.length < i + n || b.length < j + n)   return false;
      while (--n >= 0)   if (a[i++] != b[j++])   return false;
      return true;
    }
}
