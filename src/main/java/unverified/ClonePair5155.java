package unverified;

public class ClonePair5155 {

    boolean method1(double[] p_D0,double[] p_D1){
      if (p_D0 == p_D1) {
        return true;
      }
      if (p_D0 == null || p_D1 == null || p_D0.length != p_D1.length) {
        return false;
      }
      for (int i=0; i < p_D0.length; i++) {
        if (p_D0[i] != p_D1[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(double[] a,double[] a2){
      if (a == a2)   return true;
      if (a == null || a2 == null)   return false;
      int length=a.length;
      if (a2.length != length)   return false;
      for (int i=0; i < length; i++)   if (a[i] != a2[i])   return false;
      return true;
    }
}
