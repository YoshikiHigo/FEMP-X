package unverified;

public class ClonePair7872 {

    boolean method1(String day,String end){
      if (end.equals(""))   return true;
      if (day.compareToIgnoreCase(end) == 0)   return true;
      return false;
    }

    boolean method2(String saida,String gabarito){
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
}
