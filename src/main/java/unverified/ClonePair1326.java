package unverified;

public class ClonePair1326 {

    boolean method1(byte[] b1,byte[] b2){
      boolean result=false;
      if (b1 == null && b2 == null)   return true;
      if (b1 != null && b2 != null) {
        result=b1.length == b2.length;
        if (result)     for (int i=0; i < b1.length; i++)     if (b1[i] != b2[i])     result=false;
      }
      return result;
    }

    boolean method2(byte[] left,byte[] right){
      if (left == right)   return true;
     else   if (left == null || right == null || left.length != right.length)   return false;
      for (int i=0; i < left.length; i++)   if (left[i] != right[i])   return false;
      return true;
    }
}
