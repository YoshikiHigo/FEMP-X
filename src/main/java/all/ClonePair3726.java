package all;

public class ClonePair3726 {

    boolean method1(String name,String end){
      if (name.equalsIgnoreCase(end)) {
        return true;
      }
      int colon=name.lastIndexOf(":");
      if (colon >= 0) {
        String local=name.substring(colon + 1);
        return local.equalsIgnoreCase(end);
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
