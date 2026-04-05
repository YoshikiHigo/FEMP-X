package all;

public class ClonePair10906 {

    boolean method1(char c){
      if (c == '+' || c == '.' || c == '-') {
        return true;
      }
      if (Character.isLetterOrDigit(c)) {
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
