package unverified;

public class ClonePair3482 {

    boolean method1(int[] p0,int[] p1){
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

    boolean method2(int[] a,int[] b){
      boolean result=false;
      if (a.length == b.length) {
        result=true;
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i]) {
            result=false;
            break;
          }
        }
      }
      return result;
    }
}
