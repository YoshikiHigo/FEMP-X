package unverified;

public class ClonePair1374 {

    boolean method1(byte[] cksum1,byte[] cksum2){
      if (cksum1 == cksum2)   return true;
      if ((cksum1 == null && cksum2 != null) || (cksum1 != null && cksum2 == null))   return false;
      if (cksum1.length != cksum2.length)   return false;
      for (int i=0; i < cksum1.length; i++)   if (cksum1[i] != cksum2[i])   return false;
      return true;
    }

    boolean method2(byte[] x,byte[] y){
      if (x == null || y == null)   return false;
      if (x.length != y.length)   return false;
      for (int i=0; i < x.length; i++) {
        if (x[i] != y[i]) {
          return false;
        }
      }
      return true;
    }
}
