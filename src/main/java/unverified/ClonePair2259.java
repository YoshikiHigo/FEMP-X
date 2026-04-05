package unverified;

public class ClonePair2259 {

    boolean method1(byte[] ba1,byte[] ba2){
      if (ba1 == null && ba2 == null)   return true;
      if (ba1 == null || ba2 == null)   return false;
      if (ba1.length != ba2.length)   return false;
      for (int i=0; i < ba1.length; ++i) {
        if (ba1[i] != ba2[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] left,byte[] right){
      if (left == right)   return true;
     else   if (left == null || right == null || left.length != right.length)   return false;
      for (int i=0; i < left.length; i++)   if (left[i] != right[i])   return false;
      return true;
    }
}
