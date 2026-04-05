package unverified;

public class ClonePair5651 {

    boolean method1(String str,boolean bDefValue){
      if (str == null) {
        return bDefValue;
      }
     else {
        str=str.trim().toLowerCase();
        if (str.equals("true") || str.equals("yes") || str.equals("checked")|| str.equals("on")|| str.startsWith("1")) {
          return true;
        }
     else     if (str.equals("false") || str.equals("no") || str.equals("off")|| str.equals("0")) {
          return false;
        }
     else {
          return bDefValue;
        }
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
