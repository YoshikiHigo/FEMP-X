package unverified;

public class ClonePair5857 {

    boolean method1(byte[] left,int leftPos,byte[] right,int rightPos,int size){
      int i=leftPos, j=rightPos;
      if (leftPos + size > left.length)   return false;
      if (rightPos + size > right.length)   return false;
      while (size > 0) {
        if (left[i++] != right[j++])     return false;
        size--;
      }
      return true;
    }

    boolean method2(byte[] a,int i,byte[] b,int j,int n){
      if (a.length < i + n || b.length < j + n)   return false;
      while (--n >= 0)   if (a[i++] != b[j++])   return false;
      return true;
    }
}
