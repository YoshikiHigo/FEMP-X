package all;

public class ClonePair9829 {

    boolean method1(char[] src,char[] des){
      if (src.length != des.length)   return false;
      for (int i=src.length - 1; i >= 0; i--) {
        if (src[i] != des[i])     return false;
      }
      return true;
    }

    boolean method2(char[] a,char[] b){
      if (a.length != b.length)   return false;
     else {
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i])       return false;
        }
        return true;
      }
    }
}
