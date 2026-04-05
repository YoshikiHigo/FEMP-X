package unverified;

public class ClonePair6588 {

    boolean method1(long[] L1,long[] L2){
      int size1=L1.length;
      int size2=L2.length;
      if (size1 != size2) {
        return false;
      }
      for (int i=0; i < size1; i++) {
        if (L1[i] != L2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(long[] a,long[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i])     return false;
      }
      return true;
    }
}
