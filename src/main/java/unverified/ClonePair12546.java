package unverified;

public class ClonePair12546 {

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

    boolean method2(String string){
      if (string == null || string.isEmpty()) {
        return false;
      }
      int i=0;
      if (string.charAt(0) == '-') {
        if (string.length() > 1) {
          i++;
        }
     else {
          return false;
        }
      }
      for (; i < string.length(); i++) {
        char c=string.charAt(i);
        if (!Character.isDigit(c)) {
          return false;
        }
      }
      try {
        Integer.parseInt(string);
      }
     catch (  Exception ex) {
        return false;
      }
      return true;
    }
}
