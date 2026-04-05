package unverified;

public class ClonePair8337 {

    boolean method1(String saida,String gabarito){
      try {
        int nro1=Integer.parseInt(saida);
        int nro2=Integer.parseInt(gabarito);
        if (nro1 == nro2) {
          return true;
        }
      }
     catch (  NumberFormatException ex) {
        if (saida.contains(gabarito)) {
          return true;
        }
      }
      return false;
    }

    boolean method2(String saida,String gabarito){
      try {
        double nro1=Double.parseDouble(saida);
        double nro2=Double.parseDouble(gabarito);
        if (Double.compare(nro1,nro2) == 0) {
          return true;
        }
      }
     catch (  NumberFormatException ex) {
        if (saida.contains(gabarito)) {
          return true;
        }
      }
      return false;
    }
}
