package unverified;

public class ClonePair5543 {

    boolean method1(String s,boolean def){
      if (s == null) {
        return def;
      }
     else {
        return "yes".equals(s) || "true".equals(s) || "on".equals(s);
      }
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
