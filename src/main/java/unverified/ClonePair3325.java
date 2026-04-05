package unverified;

public class ClonePair3325 {

    boolean method1(int[] o1,int[] o2){
      if (o1.length != o2.length) {
        return false;
      }
     else {
        for (int i=0; i < o1.length; i++) {
          if (o1[i] != o2[i]) {
            return false;
          }
        }
        return true;
      }
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
