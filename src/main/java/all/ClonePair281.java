package all;

public class ClonePair281 {

    boolean method1(byte[] a,byte[] b){
      int alength=(a == null) ? 0 : a.length;
      int blength=(b == null) ? 0 : b.length;
      if (alength != blength) {
        return false;
      }
      for (int i=0; i < alength; ++i) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] bs1,byte[] bs2){
      if (bs1 != null && bs1.length == 0)   bs1=null;
      if (bs2 != null && bs2.length == 0)   bs2=null;
      if (bs1 == null && bs2 == null)   return true;
      if (bs1 != null && bs2 != null && bs1.length == bs2.length) {
        int length=bs1.length;
        for (int i=0; i < length; i++) {
          if (bs1[i] != bs2[i]) {
            return false;
          }
        }
        return true;
      }
      return false;
    }
}
