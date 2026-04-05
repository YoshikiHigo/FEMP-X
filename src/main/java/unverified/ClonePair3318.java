package unverified;

public class ClonePair3318 {

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
