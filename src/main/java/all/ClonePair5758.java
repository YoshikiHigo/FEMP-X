package all;

public class ClonePair5758 {

    boolean method1(String s,boolean defaultValue){
      if (s != null) {
        String s2=s.trim();
        if (s2.equalsIgnoreCase("true") || s2.equalsIgnoreCase("yes"))     return true;
        if (s2.equalsIgnoreCase("false") || s2.equalsIgnoreCase("no"))     return false;
      }
      return defaultValue;
    }

    boolean method2(String value,boolean retval){
      try {
        if ("yes".equalsIgnoreCase(value) || "true".equalsIgnoreCase(value)) {
          return true;
        }
        if ("no".equalsIgnoreCase(value) || "false".equalsIgnoreCase(value)) {
          return false;
        }
      }
     catch (  final Throwable ignored) {
      }
      return retval;
    }
}
