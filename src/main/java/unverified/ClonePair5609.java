package unverified;

public class ClonePair5609 {

    boolean method1(String value,boolean defaultValue){
      if (value == null || value.trim().length() == 0)   return defaultValue;
      return value.equals("true") || value.equals("yes") || value.equals("on");
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
