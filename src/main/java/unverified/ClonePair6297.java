package unverified;

public class ClonePair6297 {

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

    boolean method2(String actionMapping,String filterPath){
      boolean result=false;
      int index=actionMapping.indexOf(filterPath);
      if (index != -1)   result=true;
      if (index != 0 && index != -1)   if ("/".equals(actionMapping.charAt(index - 1)))   result=true;
     else   result=false;
      return result;
    }
}
