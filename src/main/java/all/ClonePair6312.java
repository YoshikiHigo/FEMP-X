package all;

public class ClonePair6312 {

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

    boolean method2(String pattern,String url){
      boolean result=false;
      String path=url;
      if (pattern.startsWith("/") && pattern.endsWith("/*")) {
        String ppath=pattern.substring(0,pattern.length() - 1);
        if (ppath.equals(path)) {
          result=true;
        }
     else     if (path.length() >= ppath.length()) {
          String upath=path.substring(0,ppath.length());
          if (ppath.equals(upath)) {
            result=true;
          }
        }
      }
     else   if (pattern.startsWith("*.")) {
        String ppath=pattern.substring(1);
        int dot=path.lastIndexOf(".");
        if (dot >= 0) {
          String upath=path.substring(dot);
          result=ppath.equals(upath);
        }
      }
     else {
        result=pattern.equals(path);
      }
      return result;
    }
}
