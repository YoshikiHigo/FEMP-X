package all;

public class ClonePair4645 {

    boolean method1(String pattern,String requestUri){
      if (pattern.equals("*")) {
        return true;
      }
     else {
        return (pattern.endsWith("*") && requestUri.startsWith(pattern.substring(0,pattern.length() - 1))) || (pattern.startsWith("*") && requestUri.endsWith(pattern.substring(1,pattern.length())));
      }
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
