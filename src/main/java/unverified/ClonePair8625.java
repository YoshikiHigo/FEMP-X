package unverified;

public class ClonePair8625 {

    boolean method1(String s,String test){
      if (s.length() < test.length())   return false;
      for (int i=0; i < test.length(); i++) {
        if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(test.charAt(i)))     return false;
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
