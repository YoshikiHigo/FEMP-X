package unverified;

public class ClonePair5748 {

    boolean method1(String v,boolean defVal){
      if ((null == v) || (v.length() <= 0))   return defVal;
      return "yes".equalsIgnoreCase(v) || "true".equalsIgnoreCase(v);
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
