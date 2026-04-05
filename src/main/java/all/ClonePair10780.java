package all;

public class ClonePair10780 {

    boolean method1(char ch){
      if (ch <= 'z' && 'a' <= ch) {
        return true;
      }
     else   if (ch <= 'Z' && 'A' <= ch) {
        return true;
      }
      return ch <= '9' && '0' <= ch;
    }

    boolean method2(char ch){
      if ((ch >= '0') && (ch <= '9')) {
        return true;
      }
      if ((ch >= 'A') && (ch <= 'Z')) {
        return true;
      }
      if ((ch >= 'a') && (ch <= 'z')) {
        return true;
      }
      return false;
    }
}
