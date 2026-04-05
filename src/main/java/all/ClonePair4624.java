package all;

public class ClonePair4624 {

    boolean method1(int POS){
    switch (POS) {
    case 1:case 2:case 3:case 4:case 5:    return true;
    default:  return false;
    }
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
