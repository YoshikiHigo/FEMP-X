package unverified;

public class ClonePair9827 {

    boolean method1(char[] src,char[] des){
      if (src.length != des.length)   return false;
      for (int i=src.length - 1; i >= 0; i--) {
        if (src[i] != des[i])     return false;
      }
      return true;
    }

    boolean method2(char[] a,char[] b){
      int l_a=a.length;
      int l_b=b.length;
      if (l_a != l_b) {
        return false;
      }
      for (int i=0; i < l_a; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
