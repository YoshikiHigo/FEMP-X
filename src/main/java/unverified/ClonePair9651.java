package unverified;

public class ClonePair9651 {

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
      if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
        return true;
      }
      return false;
    }
}
