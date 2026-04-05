package unverified;

public class ClonePair5957 {

    boolean method1(String i1,String i2){
      if (i1.length() != 0 && !i1.equals("none") && !i1.equals(i2))   return false;
      return true;
    }

    boolean method2(String s,String prefix){
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
}
