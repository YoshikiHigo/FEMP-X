package all;

public class ClonePair12535 {

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
      if (text == null) {
        return false;
      }
      if (text.length() == 0) {
        return false;
      }
      for (int i=0; i < text.length(); i++) {
        char c=text.charAt(i);
        if (c < '0' || c > '9') {
          return false;
        }
      }
      return true;
    }
}
