package all;

public class ClonePair3316 {

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

    boolean method2(int[] mark1,int[] mark2){
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
}
