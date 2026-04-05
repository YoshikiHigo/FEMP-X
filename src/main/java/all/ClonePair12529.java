package all;

public class ClonePair12529 {

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
      if ((value == null) || "".equals(value)) {
        return false;
      }
      for (int i=0; i < value.length(); i++) {
        if ((value.charAt(i) > '9') || (value.charAt(i) < '0')) {
          return false;
        }
      }
      return true;
    }
}
