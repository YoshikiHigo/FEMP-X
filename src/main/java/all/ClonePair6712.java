package all;

public class ClonePair6712 {

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

    boolean method2(String argChar,String argStr){
      boolean blnReturnValue=false;
      if ((argStr.indexOf(argChar) >= 0) && (argStr.indexOf(argChar) <= argStr.length())) {
        blnReturnValue=true;
      }
      return blnReturnValue;
    }
}
