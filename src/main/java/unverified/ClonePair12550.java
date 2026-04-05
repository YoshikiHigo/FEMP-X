package unverified;

public class ClonePair12550 {

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

    boolean method2(String sInput){
      if ((sInput == null) || (sInput.indexOf('e') >= 0) || (sInput.indexOf('E') >= 0))   return false;
      try {
        float temp=Float.parseFloat(sInput);
      }
     catch (  NumberFormatException e) {
        return false;
      }
      return true;
    }
}
