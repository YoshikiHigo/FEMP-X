package all;

public class ClonePair4699 {

    boolean method1(int column){
      if (column == 1 || column == 2 || column == 4)   return true;
     else   return false;
    }

    boolean method2(int cantidadCallesTemporal){
      if ((cantidadCallesTemporal > 0) && (cantidadCallesTemporal < 30)) {
        return true;
      }
     else {
        return false;
      }
    }
}
