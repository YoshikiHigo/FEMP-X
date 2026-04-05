package all;

public class ClonePair6014 {

    boolean method1(String prefix,String string){
      if (prefix == null || string == null || prefix.length() > string.length())   return false;
      String start=string.substring(0,prefix.length());
      return start.equalsIgnoreCase(prefix);
    }

    boolean method2(String cadena,String b){
      if (cadena == null || b == null) {
        return false;
      }
      cadena=new String(cadena.toUpperCase());
      b=new String(b.toUpperCase());
      if (cadena.length() <= b.length()) {
        for (int i=0; i <= b.length() - cadena.length(); i++) {
          if (cadena.equals(b.substring(i,i + cadena.length()))) {
            return true;
          }
        }
      }
      return false;
    }
}
