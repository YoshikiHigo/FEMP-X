package unverified;

public class ClonePair12565 {

    boolean method1(String ref){
      if (ref == null || ref.trim().length() == 0)   return (false);
      char c;
      for (int i=0; i < ref.length(); i++) {
        c=ref.charAt(i);
        if (!(c >= '0' && c <= '9')) {
          return (false);
        }
      }
      return true;
    }

    boolean method2(String value){
      if (value == null)   return false;
      try {
        double result=Double.parseDouble(value);
        if (result >= 0) {
          return true;
        }
      }
     catch (  Exception exp) {
        return false;
      }
      return false;
    }
}
