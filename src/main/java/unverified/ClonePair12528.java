package unverified;

public class ClonePair12528 {

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

    boolean method2(String text){
      boolean result=true;
      if ((text != null) && (text.length() > 0)) {
        for (int i=0; i < text.length(); i++) {
          if (!(Character.isDigit(text.charAt(i)) || Character.isWhitespace(text.charAt(i)) || (text.charAt(i) == ','))) {
            result=false;
            break;
          }
        }
      }
     else {
        result=false;
      }
      return result;
    }
}
