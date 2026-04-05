package unverified;

public class ClonePair2031 {

    boolean method1(byte[] a,byte[] b){
      boolean v=a.length == b.length;
      for (int i=0; i < a.length && v; i++) {
        if (a[i] != b[i])     v=false;
      }
      return v;
    }

    boolean method2(byte[] baFirst,byte[] baSecond){
      if (baFirst.length == baSecond.length) {
        for (int i=0; i < baFirst.length; i++) {
          if (baFirst[i] != baSecond[i]) {
            return false;
          }
        }
        return true;
      }
      return false;
    }
}
