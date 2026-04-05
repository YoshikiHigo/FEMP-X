package unverified;

public class ClonePair3344 {

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

    boolean method2(int[] p0,int[] p1){
      if (p0.length != p1.length) {
        return false;
      }
      int size=p0.length;
      boolean nonEqual=false;
      for (int x=0; x < size; x++) {
        nonEqual|=!(p0[x] == p1[x]);
      }
      return !nonEqual;
    }
}
