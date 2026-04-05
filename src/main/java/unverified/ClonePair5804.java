package unverified;

public class ClonePair5804 {

    boolean method1(byte[] a,int aOff,byte[] b,int bOff,int len){
      for (int i=0; i < len; ++i)   if (a[aOff + i] != b[bOff + i])   return false;
      return true;
    }

    boolean method2(byte[] a,int aOffset,byte[] b,int bOffset,int length){
      for (int i=0; i < length; i++)   if (a[aOffset + i] != b[bOffset + i])   return false;
      return true;
    }
}
