package unverified;

public class ClonePair6300 {

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

    boolean method2(String s,String test){
      if (s.length() < test.length())   return false;
      for (int i=0; i < test.length(); i++) {
        if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(test.charAt(i)))     return false;
      }
      return true;
    }
}
