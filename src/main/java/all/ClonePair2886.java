package all;

public class ClonePair2886 {

    boolean method1(byte[] baFirst,byte[] baSecond){
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

    boolean method2(byte[] a,byte[] b){
      if (a.length != b.length)   return false;
      int len=a.length;
      for (int i=0; i < len; i++) {
        if (a[i] != b[i])     return false;
      }
      return true;
    }
}
