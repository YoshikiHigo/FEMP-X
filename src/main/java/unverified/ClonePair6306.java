package unverified;

public class ClonePair6306 {

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

    boolean method2(String text,String suffix){
      int length=suffix.length();
      int offset=text.length() - length;
      if (offset < 0)   return false;
      for (int i=0; i < length; i++) {
        char tc=Character.toLowerCase(text.charAt(offset + i));
        char pc=Character.toLowerCase(suffix.charAt(i));
        if (tc != pc)     return false;
      }
      return true;
    }
}
