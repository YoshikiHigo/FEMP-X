package all;

public class ClonePair5132 {

    boolean method1(double[] a,double[] a2){
      if (a == a2)   return true;
      if (a == null || a2 == null)   return false;
      int length=a.length;
      if (a2.length != length)   return false;
      for (int i=0; i < length; i++)   if (Double.doubleToLongBits(a[i]) != Double.doubleToLongBits(a2[i]))   return false;
      return true;
    }

    boolean method2(double[] a,double[] b){
      if (a == b) {
        return true;
      }
      if (a != null && b == null) {
        return false;
      }
      if (a == null && b != null) {
        return false;
      }
      if (a.length == b.length) {
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i]) {
            return false;
          }
        }
        return true;
      }
      return false;
    }
}
