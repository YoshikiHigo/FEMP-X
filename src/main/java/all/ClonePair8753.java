package all;

public class ClonePair8753 {

    boolean method1(char c){
      if (Character.isDigit(c))   return true;
    switch (c) {
    case '.':case '+':case '-':case 'd':case 'D':case 'e':case 'E':case 'f':case 'F':    return true;
    default:  return false;
    }
    }

    boolean method2(char c){
      if (Character.isLetterOrDigit(c)) {
        return true;
      }
      if (c == '+' || c == '-' || c == '.') {
        return true;
      }
      return false;
    }
}
