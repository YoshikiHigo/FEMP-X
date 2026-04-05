package unverified;

public class ClonePair3219 {

    boolean method1(byte[] a,int offset,byte[] b){
      for (int i=0; i < b.length; i++)   if (a[offset + i] != b[i])   return false;
      return true;
    }

    boolean method2(byte[] src,int srcOffset,byte[] cmp){
      for (int i=0; i < cmp.length; i++) {
        if (src[srcOffset + i] != cmp[i]) {
          return false;
        }
      }
      return true;
    }
}
