package unverified;

public class ClonePair12539 {

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

    boolean method2(String candidateNumber){
      if (candidateNumber == null || candidateNumber.length() == 0) {
        return false;
      }
      for (int i=0; i < candidateNumber.length(); i++) {
        char ch=candidateNumber.charAt(i);
        if (Character.isDigit(ch) == false && ch != '.') {
          return false;
        }
      }
      return true;
    }
}
