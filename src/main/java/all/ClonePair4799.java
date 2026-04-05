package all;

public class ClonePair4799 {

    boolean method1(int cantidadCallesTemporal){
      if ((cantidadCallesTemporal > 0) && (cantidadCallesTemporal < 30)) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(int n){
      if (n <= 0) {
        return false;
      }
      if (n == 1) {
        return true;
      }
      int i=1;
      while (i < n) {
        i*=2;
      }
      return i == n;
    }
}
