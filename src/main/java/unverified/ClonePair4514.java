package unverified;

public class ClonePair4514 {

    boolean method1(String name,String template){
      int wildcardIdx=template.indexOf("*");
      if (wildcardIdx == -1)   return name.equals(template);
      boolean isBeginning=true;
      String beforeWildcard="";
      String afterWildcard=template;
      while (wildcardIdx != -1) {
        beforeWildcard=afterWildcard.substring(0,wildcardIdx);
        afterWildcard=afterWildcard.substring(wildcardIdx + 1);
        int beforeStartIdx=name.indexOf(beforeWildcard);
        if ((beforeStartIdx == -1) || (isBeginning && beforeStartIdx != 0)) {
          return false;
        }
        isBeginning=false;
        name=name.substring(beforeStartIdx + beforeWildcard.length());
        wildcardIdx=afterWildcard.indexOf("*");
      }
      return name.endsWith(afterWildcard);
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
