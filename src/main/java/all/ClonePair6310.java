package all;

public class ClonePair6310 {

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

    boolean method2(String string1,String string2){
      if (string2.length() != string1.length())   return (false);
      for (int i=0; i < string2.length(); i++) {
        if (Character.toLowerCase(string1.charAt(i)) != Character.toLowerCase(string2.charAt(i)))     return (false);
      }
      return (true);
    }
}
