package all;

public class ClonePair6689 {

    boolean method1(String expr,String extra){
      if (expr.endsWith("package-info")) {
        expr=expr.substring(0,expr.length() - "package-info".length());
      }
      for (int i=0, len=expr.length(); i < len; i++) {
        char c=expr.charAt(i);
        if (extra.indexOf(c) >= 0)     continue;
        if (!Character.isJavaIdentifierPart(c))     return false;
      }
      return true;
    }

    boolean method2(String pattern,String key){
      if (key.length() < pattern.length())   return false;
      for (int i=0; i < pattern.length(); i++) {
        char format=pattern.charAt(i);
        char ch=key.charAt(i);
        if (!((format == '#' && Character.isDigit(ch)) || (format == ch))) {
          return false;
        }
      }
      return true;
    }
}
