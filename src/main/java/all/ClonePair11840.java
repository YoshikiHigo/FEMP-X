package all;

public class ClonePair11840 {

    boolean method1(char c){
      if (Character.isLetterOrDigit(c)) {
        return true;
      }
      if ((c == '$') || (c == '-') || (c == '_')|| (c == '.')|| (c == '+')|| (c == ';')|| (c == '?')|| (c == '&')|| (c == '=')|| (c == '%')) {
        return true;
      }
      return false;
    }

    boolean method2(char c){
      if (Character.isLetterOrDigit(c)) {
        return true;
      }
      if (c == '$' || c == '-' || c == '_' || c == '.' || c == '+' || c == ';' || c == '?' || c == '&' || c == '=' || c == '%') {
        return true;
      }
      return false;
    }
}
