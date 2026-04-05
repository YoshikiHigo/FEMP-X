package unverified;

public class ClonePair6828 {

    boolean method1(String pattern,String key){
      if (key.length() < pattern.length())   return false;
      for (int i=0; i < pattern.length(); i++) {
        char format=pattern.charAt(i);
        char ch=key.charAt(i);
        if (!((format == '#' && Character.isDigit(ch)) || (format == ch))) {
          return false;
        }
      }
      return true;
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
