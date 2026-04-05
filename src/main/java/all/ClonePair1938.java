package all;

import java.util.Vector;

public class ClonePair1938 {

    boolean method1(Vector vector1,Vector vector2){
      boolean hayDiferencia=false;
      int i=0;
      int fin=0;
      if (vector1.size() != vector2.size()) {
        hayDiferencia=true;
      }
      fin=vector1.size();
      while ((i < fin) && (!hayDiferencia)) {
        if (!vector1.elementAt(i).toString().equals(vector2.elementAt(i).toString())) {
          hayDiferencia=true;
        }
        i++;
      }
      return (!hayDiferencia);
    }

    boolean method2(Vector a,Vector b){
      if (a.size() != b.size()) {
        return false;
      }
      int i=0;
      int vectorSize=a.size();
      boolean identical=true;
      for (i=0; i < vectorSize; i++) {
        if (!(a.elementAt(i).toString().equalsIgnoreCase(b.elementAt(i).toString()))) {
          identical=false;
        }
      }
      return identical;
    }
}
