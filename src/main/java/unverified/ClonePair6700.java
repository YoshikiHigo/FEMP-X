package unverified;

public class ClonePair6700 {

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

    boolean method2(String s,String test){
      if (s.length() < test.length())   return false;
      for (int i=0; i < test.length(); i++) {
        if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(test.charAt(i)))     return false;
      }
      return true;
    }
}
