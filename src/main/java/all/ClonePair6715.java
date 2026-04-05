package all;

public class ClonePair6715 {

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

    boolean method2(String s1,String s2){
      if (s1.length() != s2.length())   return false;
      int result=0;
      for (int i=0; i < s1.length(); i++) {
        int c1=s1.charAt(i);
        int c2=s2.charAt(i);
        result|=(c1 ^ c2);
      }
      return result == 0;
    }
}
