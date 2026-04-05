package all;

public class ClonePair8330 {

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

    boolean method2(String str,String op){
      if (str.length() >= op.length()) {
        for (int i=0; i <= str.length() - op.length(); i++) {
          if (i == (str.length() - op.length())) {
            if (str.substring(i).equals(op))         return true;
          }
     else       if (str.substring(i,op.length() + i).equals(op))       return true;
        }
      }
      return false;
    }
}
