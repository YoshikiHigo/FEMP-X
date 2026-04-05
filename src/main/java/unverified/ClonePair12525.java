package unverified;

public class ClonePair12525 {

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
      try {
        short shortVal=Short.parseShort(value);
        if (!(shortVal + "").equalsIgnoreCase(value))     return false;
        return shortVal > -1;
      }
     catch (  Exception e) {
        return false;
      }
    }
}
