package all;

public class ClonePair4802 {

    boolean method1(int cantidadCallesTemporal){
      if ((cantidadCallesTemporal > 0) && (cantidadCallesTemporal < 30)) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(int month){
      boolean valid=false;
      if (month > 0 && month <= 12) {
        valid=true;
      }
      return valid;
    }
}
