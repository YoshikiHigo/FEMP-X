package unverified;

public class ClonePair6693 {

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

    boolean method2(String i1,String i2){
      if (i1.length() != 0 && !i1.equals("none") && !i1.equals(i2)) {
        return false;
      }
      return true;
    }
}
