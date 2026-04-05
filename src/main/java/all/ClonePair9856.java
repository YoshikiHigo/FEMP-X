package all;

public class ClonePair9856 {

    boolean method1(char[] a,char[] b){
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

    boolean method2(char[] p1,char[] p2){
      boolean bMatch=true;
      if (p1.length == p2.length) {
        for (int i=0; i < p1.length; i++) {
          if (p1[i] != p2[i]) {
            bMatch=false;
            break;
          }
        }
      }
     else {
        bMatch=false;
      }
      return bMatch;
    }
}
