package unverified;

public class ClonePair9174 {

    boolean method1(char c){
      if (Character.isLetterOrDigit(c)) {
        return true;
      }
      if (c == '+' || c == '-' || c == '.') {
        return true;
      }
      return false;
    }

    boolean method2(char c){
      if (Character.isLetterOrDigit(c)) {
        return true;
      }
      if ((c == '+') || (c == '-') || (c == '.')) {
        return true;
      }
      return false;
    }
}
