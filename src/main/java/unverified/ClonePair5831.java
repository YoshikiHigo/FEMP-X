package unverified;

public class ClonePair5831 {

    boolean method1(byte[] a,int aOffset,byte[] b,int bOffset,int length){
      for (int i=0; i < length; i++)   if (a[aOffset + i] != b[bOffset + i])   return false;
      return true;
    }

    boolean method2(byte[] key1,int off1,byte[] key2,int off2,int len){
      for (int i=0; i < len; i++) {
        if (key1[i + off1] != key2[i + off2])     return false;
      }
      return true;
    }
}
