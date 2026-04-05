package all;

public class ClonePair6691 {

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

    boolean method2(String day,String end){
      if (end.equals(""))   return true;
      if (day.compareToIgnoreCase(end) == 0)   return true;
      return false;
    }
}
