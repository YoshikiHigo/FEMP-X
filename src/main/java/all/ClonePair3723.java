package all;

public class ClonePair3723 {

    boolean method1(String name,String end){
      if (name.equalsIgnoreCase(end)) {
        return true;
      }
      int colon=name.lastIndexOf(":");
      if (colon >= 0) {
        String local=name.substring(colon + 1);
        return local.equalsIgnoreCase(end);
      }
      return false;
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
