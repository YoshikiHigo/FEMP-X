package unverified;

public class ClonePair2385 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1.length != b2.length)   return false;
      for (int i=0; i < b1.length; i++)   if (b1[i] != b2[i])   return false;
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      int aLength=a.length;
      if (aLength != b.length)   return false;
      for (int i=0; i < aLength; i++)   if (a[i] != b[i])   return false;
      return true;
    }
}
