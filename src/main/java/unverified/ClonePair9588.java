package unverified;

public class ClonePair9588 {

    boolean method1(char c){
      if ((c >= 65 && c < 91) || (c >= 97 && c < 123)) {
        return true;
      }
     else   if (c >= 48 && c <= 57) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(char ch){
      if (ch <= 'z' && 'a' <= ch) {
        return true;
      }
     else   if (ch <= 'Z' && 'A' <= ch) {
        return true;
      }
      return ch <= '9' && '0' <= ch;
    }
}
