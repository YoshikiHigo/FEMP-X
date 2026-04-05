package unverified;

public class ClonePair8699 {

    boolean method1(String balise,String name){
      int length=balise.length();
      if (!balise.isEmpty() && balise.charAt(length - 1) == '*') {
        return name.startsWith(balise.substring(0,length - 1));
      }
     else {
        return name.equals(balise);
      }
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
