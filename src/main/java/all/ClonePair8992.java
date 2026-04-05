package all;

public class ClonePair8992 {

    boolean method1(double[][] tableau){
      for (int i=1; i < tableau.length; i++) {
        if (tableau[0].length != tableau[i].length) {
          return false;
        }
      }
      return true;
    }

    boolean method2(double[][] a){
      if (a.length == 0) {
        return true;
      }
      int length=a[0].length;
      for (int i=1; i < a.length; i++) {
        double[] x=a[i];
        if (x.length != length) {
          return false;
        }
      }
      return true;
    }
}
