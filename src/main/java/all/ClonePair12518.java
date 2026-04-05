package all;

public class ClonePair12518 {

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

    boolean method2(String phoneNumber){
      if (phoneNumber == null || phoneNumber.length() == 0) {
        return false;
      }
      if (phoneNumber.equals("+")) {
        return false;
      }
      for (int i=0; i < phoneNumber.length(); i++) {
        if (phoneNumber.charAt(i) == '+') {
          if (i > 0) {
            return false;
          }
     else {
            continue;
          }
        }
        if (!(phoneNumber.charAt(i) >= '0' && phoneNumber.charAt(i) <= '9')) {
          return false;
        }
      }
      return true;
    }
}
