package unverified;

public class ClonePair3350 {

    boolean method1(int[] mark1,int[] mark2){
      int m1=mark1.length;
      int m2=mark2.length;
      if (m1 != m2) {
        return false;
      }
     else {
        for (int i=0; i < m1; i++) {
          if ((int)(mark1[i]) != (int)(mark2[i])) {
            return false;
          }
        }
      }
      return true;
    }

    boolean method2(int[] indices1,int[] indices2){
      if (indices1.length != indices2.length) {
        return false;
      }
      int len=indices1.length;
      int j;
      for (j=0; j < len; j++) {
        if (indices1[0] == indices2[j]) {
          break;
        }
      }
      if (j == len) {
        return false;
      }
      for (int i=1; i < len; i++) {
        if (indices1[i] != indices2[(j + i) % len]) {
          return false;
        }
      }
      return true;
    }
}
