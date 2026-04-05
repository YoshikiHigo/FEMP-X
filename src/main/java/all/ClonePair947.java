package all;

public class ClonePair947 {

    boolean method1(byte[] acB,byte[] newAC){
      if (acB.length != newAC.length) {
        return false;
      }
      for (int i=0; i < acB.length; i++) {
        if (acB[i] != newAC[i]) {
          return false;
        }
     else {
          break;
        }
      }
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; ++i)   if (a[i] != b[i])   return false;
      return true;
    }
}
