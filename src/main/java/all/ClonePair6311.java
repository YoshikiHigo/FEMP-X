package all;

public class ClonePair6311 {

    boolean method1(String s,String prefix){
      final int pl=prefix.length();
      if (s.length() < pl)   return false;
      for (int i=0; i < pl; i++) {
        char sc=s.charAt(i);
        char pc=prefix.charAt(i);
        if (sc != pc) {
          sc=Character.toUpperCase(sc);
          pc=Character.toUpperCase(pc);
          if (sc != pc) {
            sc=Character.toLowerCase(sc);
            pc=Character.toLowerCase(pc);
            if (sc != pc)         return false;
          }
        }
      }
      return true;
    }

    boolean method2(String str,String suffix){
      if (str.length() < suffix.length())   return false;
      String end=str.substring(str.length() - suffix.length(),str.length());
      return end.equalsIgnoreCase(suffix);
    }
}
