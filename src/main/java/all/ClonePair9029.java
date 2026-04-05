package all;

public class ClonePair9029 {

    boolean method1(String s1,String s2){
      if (s1.startsWith(s2))   return true;
      s2=" " + s2;
      int len1=s1.length();
      int len2=s2.length();
      boolean match, inLiteral=false;
      char c;
      for (int i=0; i < len1 - len2 + 1; i++) {
        c=s1.charAt(i);
        if (inLiteral && c == ']')     inLiteral=false;
     else     if (c == '[')     inLiteral=true;
        if (c != s2.charAt(0) || inLiteral || (i > 1 && s1.charAt(i - 1) == '='))     continue;
        match=true;
        for (int j=0; j < len2; j++) {
          if (s2.charAt(j) != s1.charAt(i + j)) {
            match=false;
            break;
          }
        }
        if (match)     return true;
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
