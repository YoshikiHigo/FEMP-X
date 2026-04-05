package all;

public class ClonePair3209 {

    boolean method1(byte[] bytes,int start,byte[] subBytes){
      for (int i=0; i < subBytes.length; ) {
        if (bytes[start++] != subBytes[i++]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] a,int offset,byte[] b){
      for (int i=0; i < b.length; i++)   if (a[offset + i] != b[i])   return false;
      return true;
    }
}
